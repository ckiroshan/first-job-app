package com.irocodes.firstjobapp.review;

import java.util.List;

public interface ReviewService {
    List<Review> getAllReviews(Long companyId); // Get all reviews of a company
}
