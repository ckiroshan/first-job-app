package com.irocodes.firstjobapp.review;

import java.util.List;

public interface ReviewService {
    List<Review> getAllReviews(Long companyId); // Get all reviews of a company

    boolean addReview(Long companyId, Review review); // Add review for a company

    Review getReviewById(Long companyId, Long reviewId); // Get review by ID

    boolean updateReview(Long companyId, Long reviewId, Review review); // Update review by Review ID

    boolean deleteReview(Long companyId, Long reviewId); // Delete review by Review ID
}
