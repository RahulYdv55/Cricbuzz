package com.cricbuzz.demo.controller;

import com.cricbuzz.demo.Model.Trending;
import com.cricbuzz.demo.service.TrendingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trending")
@Slf4j
public class TrendingController {

    @Autowired
    private TrendingService trendingService;

    @GetMapping
    public Trending getTop(){
        log.info("Retrieving data");
       return trendingService.getTrendingVideoAndNews();
    }
}
