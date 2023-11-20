package com.irocodes.firstjobapp.review;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companies/{companyId}")
public class ReviewController {
    private ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping("/reviews") // Get all reviews of a company
    public ResponseEntity<List<Review>> findAllReviews(@PathVariable Long companyId) {
        return new ResponseEntity<>(reviewService.getAllReviews(companyId), HttpStatus.OK);
    }

    @PostMapping("/reviews") // Add review for a company
    public ResponseEntity<String> addReview(@PathVariable Long companyId, @RequestBody Review review) {
        boolean reviewSaved = reviewService.addReview(companyId, review);
        if (reviewSaved) {
            return new ResponseEntity<>("Review Added Successfully!", HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>("Review Not Saved!", HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/reviews/{reviewId}") // Get review for a company by ID
    private ResponseEntity<Review> getReviewById(@PathVariable Long companyId, @PathVariable Long reviewId) {
        Review reviews = reviewService.getReviewById(companyId, reviewId);
        if (reviews != null) {
            return new ResponseEntity<>(reviews, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
