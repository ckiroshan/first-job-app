package com.irocodes.firstjobapp.job;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobServiceImpl implements JobService {
    // Temporary Array List [As DB is not yet connected]
    private List<Job> jobs = new ArrayList<>();
    private Long nextId = 1L; // ID variable

    @Override
    public List<Job> findAll() {
        return jobs;
    }

    @Override
    public void createJob(Job job) {
        job.setId(nextId++); // Each save, value increments by 1.
        jobs.add(job);
    }
}
