package com.irocodes.firstjobapp.job;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
    // Spring data JPA will auto-generate all implementations at runtime.
    // Nothing else to specify here.
}
