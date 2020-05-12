package io.kompozytywni.api;

import io.kompozytywni.model.Gallery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

@Controller
public class GalleryApiController implements GalleryApi {

    private static final Logger log = LoggerFactory.getLogger(GalleryApiController.class);
    private final HttpServletRequest request;

    @Autowired
    public GalleryApiController(HttpServletRequest request) {
        this.request = request;
    }

    public ResponseEntity<Void> getGalleries() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> addGallery(Gallery body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteGallery(Long galleryId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Gallery> getGalleryById(Long galleryId) {
        return new ResponseEntity<Gallery>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateGallery(Gallery body, Long galleryId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> uploadImageToGallery(Long galleryId, String additionalMetadata, MultipartFile photo) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
