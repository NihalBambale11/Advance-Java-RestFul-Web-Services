package com.post.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.post.entities.JobPost;
import com.post.exception.ResourceNotFoundException;
import com.post.repository.JobRepository;

import job.post.dtos.JobPostDTOS;

@Service
@Repository
public class JobServiceImplementation implements JobService {
	
	@Autowired
	JobRepository jobrepository;
	
	@Override
	public List<JobPost> selectJobPosting() {
		return jobrepository.findAll();
	}

	@Override
	public JobPost insertIntoJobPosting(JobPost jobpost) {
		return jobrepository.save(jobpost) ;
	}

	@Override
	public JobPostDTOS updateJobPosting(Long pid, JobPost jobpost) {
		String message = "";
		if(jobrepository.existsById(pid)) {
			jobrepository.save(jobpost);
			message = "Data Updated Successfully";
		}
		else {
			throw new ResourceNotFoundException("Id Not Found");
		}
		return new JobPostDTOS("message",LocalDateTime.now());
	}

	@Override
	public JobPostDTOS deleteFromJobPost(Long pid) {
		JobPost jp = jobrepository.findById(pid).orElseThrow(() -> new ResourceNotFoundException("Pid Not Found"));
		jobrepository.delete(jp);
		return new JobPostDTOS("JobPost Deleted",LocalDateTime.now());
	}
	
	
}
