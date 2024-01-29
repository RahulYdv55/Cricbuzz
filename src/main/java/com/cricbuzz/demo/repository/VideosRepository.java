package com.cricbuzz.demo.repository;

import com.cricbuzz.demo.Model.News;
import com.cricbuzz.demo.Model.Videos;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VideosRepository extends JpaRepository<Videos,Integer> {

    Page<Videos> findAll(Pageable pageable);

    List<Videos> findTop4ByOrderByTimestampDesc();
}
