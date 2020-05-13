package io.kompozytywni.controller;

import io.kompozytywni.model.Partner;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import javax.validation.Valid;
import java.util.List;

@RequestMapping
public interface PartnerApi {

    @RequestMapping(value = "/partners",
            produces = { "application/json" },
            method = RequestMethod.GET)
    ResponseEntity<List<Partner>> getPartners();

    @RequestMapping(value = "/partner",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> addPartner(@Valid @RequestBody Partner body);

    @RequestMapping(value = "/partner/{partnerId}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deletePartner(@PathVariable("partnerId") Long partnerId);

    @RequestMapping(value = "/partner/{partnerId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Partner> getPartnerById(@PathVariable("partnerId") Long partnerId);

    @RequestMapping(value = "/partner/{partnerId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> updatePartner(@Valid @RequestBody Partner body, @PathVariable("partnerId") Long partnerId);

    @RequestMapping(value = "/partner/{partnerId}/uploadImage",
        produces = { "application/json" }, 
        consumes = { "multipart/form-data" },
        method = RequestMethod.POST)
    ResponseEntity<Void> uploadImageToPartner(@PathVariable("partnerId") Long partnerId, @RequestParam(value="additionalMetadata", required=false)  String additionalMetadata, @Valid @RequestPart(value="photo", required=false) MultipartFile photo);
}
