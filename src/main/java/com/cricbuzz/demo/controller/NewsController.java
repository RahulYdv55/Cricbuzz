package com.cricbuzz.demo.controller;

import com.cricbuzz.demo.Model.News;
import com.cricbuzz.demo.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/news")
public class NewsController {

    @Autowired
    private NewsService newsService;

    @GetMapping
    public List<News> getNews(@RequestParam("page") int page, @RequestParam("size") int size){
      return  newsService.getNewsPagination(page,size);
    }

    @DeleteMapping
    public void deleteNews(@RequestParam("id") int id){
        newsService.deleteNewsById(id);
    }

    @PostMapping
    public News post(@RequestBody News news){
        return newsService.save(news);
    }

}
