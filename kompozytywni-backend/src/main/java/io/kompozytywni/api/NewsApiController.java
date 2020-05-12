package io.kompozytywni.api;

import io.kompozytywni.model.News;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;

@Controller
public class NewsApiController implements NewsApi {

    private static final Logger log = LoggerFactory.getLogger(NewsApiController.class);
    private final HttpServletRequest request;

    @Autowired
    public NewsApiController(HttpServletRequest request) {
        this.request = request;
    }

    public ResponseEntity<Void> getNews() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> addNews(News body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteNews(Long newsId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<News> getSingleNews(Long newsId) {
        return new ResponseEntity<News>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateNews(Long newsId, News body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
