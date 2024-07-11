package com.post.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.post.entities.JobPost;
import com.post.service.JobService;

@RestController
@RequestMapping("/jobPostings")
public class JobController {
	
	@Autowired
	private JobService jobservice;
	
	public JobController() {
		System.out.println("Hello From Job Controller");
	}
	
	@GetMapping
	public ResponseEntity<?> getAllPostings(){
		return ResponseEntity.ok(jobservice.selectJobPosting());
	}
	
	@PostMapping
	public ResponseEntity<?> setJobPostings(@RequestBody JobPost jobpost){
		return ResponseEntity.status(HttpStatus.CREATED).body(jobservice.insertIntoJobPosting(jobpost));
	}
	
	@PutMapping("/{pid}")
	public ResponseEntity<?> ChangeJobPosting(@PathVariable Long pid , @RequestBody JobPost jobpost){
		return ResponseEntity.status(HttpStatus.OK).body(jobservice.updateJobPosting(pid,jobpost));
	}
	
	@DeleteMapping("/{pid}")
	public ResponseEntity<?> deleteJobPosting(@PathVariable Long pid){
		return ResponseEntity.ok(jobservice.deleteFromJobPost(pid));
	}
}
