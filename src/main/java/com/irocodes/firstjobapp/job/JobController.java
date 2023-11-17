package com.irocodes.firstjobapp.job;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class JobController {
    // JobService object
    private JobService jobService;

    // Constructor
    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    // Get all jobs
    @GetMapping("/jobs")
    public List<Job> findAll() {
        return jobService.findAll();
    }

    // Get Job by ID
    @GetMapping("/jobs/{id}")
    private Job getJobById(@PathVariable Long id) {
        Job job = jobService.getJobById(id);
        return job;
    }

    // Create a new job
    @PostMapping("/jobs")
    public String createJob(@RequestBody Job job) {
        jobService.createJob(job);
        return "Job added successfully!";
    }
}
