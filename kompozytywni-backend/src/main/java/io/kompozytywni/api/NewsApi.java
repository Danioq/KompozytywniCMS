package io.kompozytywni.api;

import io.kompozytywni.model.News;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.validation.Valid;

@RequestMapping
public interface NewsApi {

    @RequestMapping(value = "/news",
            produces = { "application/json" },
            method = RequestMethod.GET)
    ResponseEntity<Void> getNews();

    @RequestMapping(value = "/news",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> addNews(@Valid @RequestBody News body);

    @RequestMapping(value = "/news/{newsId}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteNews(@PathVariable("newsId") Long newsId);

    @RequestMapping(value = "/news/{newsId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<News> getSingleNews(@PathVariable("newsId") Long newsId);

    @RequestMapping(value = "/news/{newsId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateNews(@PathVariable("newsId") Long newsId, @Valid @RequestBody News body);
}
