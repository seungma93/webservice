package com.seungma93.webservice.domain.posts;

import javafx.geometry.Pos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;


public interface PostsRepository extends JpaRepository<Posts, Long> {

    @Query("SELECT p " +
            "FROM Posts p "+
            "ORDER BY p.id DESC")
    Stream<Posts> findAllDesc();
}
