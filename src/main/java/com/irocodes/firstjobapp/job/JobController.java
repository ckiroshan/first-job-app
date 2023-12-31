package com.irocodes.firstjobapp.job;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobs") // Base URL
public class JobController {
    // JobService object
    private JobService jobService;

    // Constructor
    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    // Get all jobs
    @GetMapping
    public ResponseEntity<List<Job>> findAll() {
        return ResponseEntity.ok(jobService.findAll());
    }

    // Get Job by ID
    @GetMapping("/{id}")
    private ResponseEntity<Job> getJobById(@PathVariable Long id) {
        Job job = jobService.getJobById(id);
        if (job != null) {
            return new ResponseEntity<>(job, HttpStatus.OK);
        }
        // If Job ID not found! will return
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // Create a new job
    @PostMapping
    public ResponseEntity<String> createJob(@RequestBody Job job) {
        jobService.createJob(job);
        return new ResponseEntity<>("Job added successfully!", HttpStatus.CREATED);
    }

    // Delete existing Job by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteJob(@PathVariable Long id) {
        boolean deleted = jobService.deleteJobById(id);
        if (deleted) {
            return new ResponseEntity<>("Job deleted successfully!", HttpStatus.OK);
        }
        // If Job ID not found! will return
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // Update existing Job by ID
    // @RequestMapping(value ="/{id}", method = RequestMethod.PUT) - But @PutMapping is used instead
    @PutMapping("/{id}")
    public ResponseEntity<String> updateJob(@PathVariable Long id, @RequestBody Job updatedJob) {
        boolean updated = jobService.updateJob(id, updatedJob);
        if (updated) {
            return new ResponseEntity<>("Job updated successfully!", HttpStatus.OK);
        }
        // If Job ID not found! will return
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
