package com.irocodes.firstjobapp.job;

import java.util.List;

public interface JobService {
    //    All methods are defined here. They are implemented on JobServiceImpl

    // Method: Get all Jobs
    List<Job> findAll();

    // Method: Create a new Job
    void createJob(Job job);

    // Method: Get Job with {id}
    Job getJobById(Long id);

    // Method: Delete Job with {id}
    boolean deleteJobById(Long id);

    // Method: Update Job with {id}
    boolean updateJob(Long id, Job updatedJob);
}
