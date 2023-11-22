package com.irocodes.firstjobapp.company;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.irocodes.firstjobapp.job.Job;
import com.irocodes.firstjobapp.review.Review;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

    //    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL, orphanRemoval = true) // Will remove all jobs linked to Company
    @JsonIgnore // Will remove recursive call backs in infinite loop.
    @OneToMany(mappedBy = "company") // 1 company can have many jobs.
    private List<Job> jobs;
    @OneToMany(mappedBy = "company") // 1 company can have many reviews.
    private List<Review> reviews;

    // Constructors
    public Company() {
        // Default Constructor
    }

    public Company(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    // Getters & Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }
}
