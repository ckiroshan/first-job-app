package com.irocodes.firstjobapp.review;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    // Spring data JPA will auto-generate all implementations at runtime.
}
