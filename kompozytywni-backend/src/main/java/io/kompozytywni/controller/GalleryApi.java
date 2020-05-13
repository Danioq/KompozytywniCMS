package io.kompozytywni.controller;

import io.kompozytywni.model.Gallery;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;

@RequestMapping
public interface GalleryApi {

    @RequestMapping(value = "/galleries",
            produces = { "application/json" },
            method = RequestMethod.GET)
    ResponseEntity<Void> getGalleries();

    @RequestMapping(value = "/gallery",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> addGallery(@Valid @RequestBody Gallery body);

    @RequestMapping(value = "/gallery/{galleryId}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteGallery(@PathVariable("galleryId") Long galleryId);

    @RequestMapping(value = "/gallery/{galleryId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Gallery> getGalleryById(@PathVariable("galleryId") Long galleryId);

    @RequestMapping(value = "/gallery/{galleryId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateGallery(@Valid @RequestBody Gallery body, @PathVariable("galleryId") Long galleryId);

    @RequestMapping(value = "/gallery/{galleryId}/uploadImage",
        produces = { "application/json" }, 
        consumes = { "multipart/form-data" },
        method = RequestMethod.POST)
    ResponseEntity<Void> uploadImageToGallery(@PathVariable("galleryId") Long galleryId, @RequestParam(required=false)  String additionalMetadata, @Valid @RequestPart(value="photo", required=false) MultipartFile photo);
}
