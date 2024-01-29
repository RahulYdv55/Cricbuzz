package com.cricbuzz.demo.service;

import com.cricbuzz.demo.Model.Videos;
import com.cricbuzz.demo.repository.VideosRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Slf4j
public class VideosService {

    @Autowired
    private VideosRepository videosRepository;

    public List<Videos> getVideosPagination(int page, int size){
        PageRequest pageable = PageRequest.of(page, size);
        return  videosRepository.findAll(pageable).getContent();
    }

    public void deleteVideosById(int id){
        log.info("Deleting news with id : {}",id);
        videosRepository.deleteById(id);
    }

    public Videos save(Videos videos){
        videos.setTimestamp(LocalDateTime.now());
        return videosRepository.save(videos);
    }
}
