package com.irocodes.firstjobapp.review;

import java.util.List;

public interface ReviewService {
    List<Review> getAllReviews(Long companyId); // Get all reviews of a company

    boolean addReview(Long companyId, Review review); // Add review for a company
    Review getReviewById(Long companyId, Long reviewId); // Get review by ID
}
