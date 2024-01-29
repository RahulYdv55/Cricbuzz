package com.cricbuzz.demo.repository;

import com.cricbuzz.demo.Model.News;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NewsRepository extends JpaRepository<News,Integer> {

    Page<News> findAll(Pageable pageable);

    List<News> findTop4ByOrderByTimestampDesc();
}
