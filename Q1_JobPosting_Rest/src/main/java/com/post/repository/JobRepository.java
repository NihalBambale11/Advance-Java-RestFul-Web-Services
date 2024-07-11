package com.post.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.post.entities.JobPost;

public interface JobRepository extends JpaRepository<JobPost, Long> {

}
