package io.kompozytywni.controller;

import io.kompozytywni.model.Partner;
import io.kompozytywni.repository.PartnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class PartnerApiController implements PartnerApi {

    @Autowired
    private PartnerRepository partnerRepository;

    private static final Logger log = LoggerFactory.getLogger(PartnerApiController.class);
    private final HttpServletRequest request;

    @Autowired
    public PartnerApiController(HttpServletRequest request) {
        this.request = request;
    }

    public @ResponseBody ResponseEntity<List<Partner>> getPartners() {
        return new ResponseEntity<>(partnerRepository.findAll(), HttpStatus.OK);
    }

    public ResponseEntity<Void> addPartner(Partner body) {
        partnerRepository.save(body);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    public ResponseEntity<Void> deletePartner(Long partnerId) {
        partnerRepository.delete(partnerId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    public @ResponseBody ResponseEntity<Partner> getPartnerById(Long partnerId) {
        return new ResponseEntity<>(partnerRepository.getOne(partnerId), HttpStatus.OK);
    }

    public ResponseEntity<Void> updatePartner(Partner body, Long partnerId) {
        Partner partner = partnerRepository.getOne(partnerId);
        partner.setName(body.getName());
        partner.setDescription(body.getDescription());
        partner.setLogo(body.getLogo());
        partnerRepository.save(partner);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    public ResponseEntity<Void> uploadImageToPartner(Long partnerId, String additionalMetadata, MultipartFile photo) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
