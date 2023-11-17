package com.irocodes.firstjobapp.job;

import java.util.List;

public interface JobService {
//    All methods are defined here. They are implemented on JobServiceImpl
    List<Job> findAll(); // Method: Get all Jobs
    void createJob(Job job); // Method: Create a new Job
    Job getJobById(Long id); // Method: Get Job with {id}
}
