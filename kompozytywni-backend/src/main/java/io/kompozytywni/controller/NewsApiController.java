package io.kompozytywni.controller;

import io.kompozytywni.model.News;
import io.kompozytywni.repository.NewsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class NewsApiController implements NewsApi {

    @Autowired
    private NewsRepository newsRepository;

    private static final Logger log = LoggerFactory.getLogger(NewsApiController.class);
    private final HttpServletRequest request;

    @Autowired
    public NewsApiController(HttpServletRequest request) {
        this.request = request;
    }

    public @ResponseBody ResponseEntity<List<News>> getNews() {
        return new ResponseEntity<>(newsRepository.findAll(), HttpStatus.OK);
    }

    public ResponseEntity<Void> addNews(News body) {
        newsRepository.save(body);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    public ResponseEntity<Void> deleteNews(Long newsId) {
        newsRepository.delete(newsId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    public @ResponseBody ResponseEntity<News> getSingleNews(Long newsId) {
        return new ResponseEntity<>(newsRepository.getOne(newsId), HttpStatus.OK);
    }

    public ResponseEntity<Void> updateNews(Long newsId, News body) {
        News news = newsRepository.getOne(newsId);
        news.setTitle(body.getTitle());
        news.setDescription(body.getDescription());
        news.setDate(body.getDate());
        news.setPhotos(body.getPhotos());
        news.setProjectId(body.getProjectId());
        newsRepository.save(news);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
