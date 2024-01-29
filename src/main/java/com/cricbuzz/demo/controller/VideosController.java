package com.cricbuzz.demo.controller;

import com.cricbuzz.demo.Model.Videos;
import com.cricbuzz.demo.service.VideosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/videos")
public class VideosController {

    @Autowired
    private VideosService videosService;

    @GetMapping
    public List<Videos> getVideo(@RequestParam("page") int page, @RequestParam("size") int size){
        return  videosService.getVideosPagination(page,size);
    }

    @DeleteMapping
    public void deleteVideo(@RequestParam("id") int id){
        videosService.deleteVideosById(id);
    }

    @PostMapping
    public Videos post(@RequestBody Videos videos){
        return videosService.save(videos);
    }
}
