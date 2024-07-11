package com.post.service;

import java.util.List;

import com.post.entities.JobPost;

import job.post.dtos.JobPostDTOS;

public interface JobService {

	List<JobPost> selectJobPosting();

	JobPost insertIntoJobPosting(JobPost jobpost);

	JobPostDTOS updateJobPosting(Long pid, JobPost jobpost);

	JobPostDTOS deleteFromJobPost(Long pid);
	
}
