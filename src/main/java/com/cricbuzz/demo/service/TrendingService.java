package com.cricbuzz.demo.service;

import com.cricbuzz.demo.Model.News;
import com.cricbuzz.demo.Model.Trending;
import com.cricbuzz.demo.Model.Videos;
import com.cricbuzz.demo.repository.NewsRepository;
import com.cricbuzz.demo.repository.VideosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrendingService {

    @Autowired
    private NewsRepository newsRepository;

    @Autowired
    private VideosRepository videosRepository;

    public Trending getTrendingVideoAndNews(){
        List<News> news = newsRepository.findTop4ByOrderByTimestampDesc();
        List<Videos> videos = videosRepository.findTop4ByOrderByTimestampDesc();
        Trending trending = new Trending(news,videos);
        return trending;
    }
}
