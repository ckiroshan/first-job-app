package com.irocodes.firstjobapp.review;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    // Spring data JPA will auto-generate all implementations at runtime.
    List<Review> findByCompanyId(Long companyId); // Custom JPA implementation
}
