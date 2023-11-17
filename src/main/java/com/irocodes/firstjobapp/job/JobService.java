package com.irocodes.firstjobapp.job;

import java.util.List;

public interface JobService {
//    All methods are defined here. They are implemented on JobServiceImpl
    List<Job> findAll();
    void createJob(Job job);
}
