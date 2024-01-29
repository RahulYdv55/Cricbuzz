package com.cricbuzz.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Trending {

    List<News> trendingNews;
    List<Videos> trendingVideos;
}

