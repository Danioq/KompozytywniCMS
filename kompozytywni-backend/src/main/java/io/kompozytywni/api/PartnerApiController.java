package io.kompozytywni.api;

import io.kompozytywni.model.Partner;
import org.springframework.beans.factory.annotation.Autowired;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletRequest;

@Controller
public class PartnerApiController implements PartnerApi {

    private static final Logger log = LoggerFactory.getLogger(PartnerApiController.class);
    private final HttpServletRequest request;

    @Autowired
    public PartnerApiController(HttpServletRequest request) {
        this.request = request;
    }

    public ResponseEntity<Void> getPartners() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> addPartner(Partner body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deletePartner(Long partnerId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Partner> getPartnerById(Long partnerId) {
        return new ResponseEntity<Partner>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updatePartner(Partner body, Long partnerId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> uploadImageToPartner(Long partnerId, String additionalMetadata, MultipartFile photo) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
