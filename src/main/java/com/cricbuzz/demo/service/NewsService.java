package com.cricbuzz.demo.service;

import com.cricbuzz.demo.Model.News;
import com.cricbuzz.demo.repository.NewsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Slf4j
public class NewsService {

    @Autowired
    private NewsRepository newsRepository;

    public List<News> getNewsPagination(int page, int size){
        PageRequest pageable = PageRequest.of(page, size);
        return  newsRepository.findAll(pageable).getContent();
    }

    public void deleteNewsById(int id){
        log.info("Deleting news with id : {}",id);
        newsRepository.deleteById(id);
    }

    public News save(News news){
        news.setTimestamp(LocalDateTime.now());
        return newsRepository.save(news);
    }
}
