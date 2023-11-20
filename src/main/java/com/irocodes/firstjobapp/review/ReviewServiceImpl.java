package com.irocodes.firstjobapp.review;

import com.irocodes.firstjobapp.company.Company;
import com.irocodes.firstjobapp.company.CompanyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {
    private final ReviewRepository reviewRepository; // reviewRepository instance
    private final CompanyService companyService; // companyService instance

    // Constructors
    public ReviewServiceImpl(ReviewRepository reviewRepository, CompanyService companyService) {
        this.reviewRepository = reviewRepository;
        this.companyService = companyService;
    }

    @Override // Get all reviews of a company
    public List<Review> getAllReviews(Long companyId) {
        List<Review> reviews = reviewRepository.findByCompanyId(companyId);
        return reviews;
    }

    @Override // Add review for a company
    public boolean addReview(Long companyId, Review review) {
        Company company = companyService.getCompanyById(companyId);
        if (company != null) {
            review.setCompany(company);
            reviewRepository.save((review));
            return true;
        } else {
            return false;
        }
    }

    @Override // Get review for a company by ID
    public Review getReviewById(Long companyId, Long reviewId) {
        List<Review> reviews = reviewRepository.findByCompanyId(companyId);
        return reviews.stream()
                .filter(review -> review.getId().equals(reviewId))
                .findFirst()
                .orElse(null);
    }

    @Override // Update review ID of a company
    public boolean updateReview(Long companyId, Long reviewId, Review updatedReview) {
        if (companyService.getCompanyById(companyId) != null) {
            updatedReview.setCompany(companyService.getCompanyById(companyId));
            updatedReview.setId(reviewId);
            reviewRepository.save(updatedReview);
            return true;
        } else
            return false;
    }

    @Override // Delete review by Review ID
    public boolean deleteReview(Long companyId, Long reviewId) {
        if (companyService.getCompanyById(companyId) != null && reviewRepository.existsById(reviewId)) {
            Review review = reviewRepository.findById(reviewId).orElse(null); // Retrieve review
            Company company = review.getCompany();  // Retrieve company
            company.getReviews().remove(review);  // Remove review from company reference
            review.setCompany(null);
            companyService.updateCompany(companyId, company); // Updating the company
            reviewRepository.deleteById(reviewId); // Deleting the review
            return true;
        } else
            return false;
    }
}
