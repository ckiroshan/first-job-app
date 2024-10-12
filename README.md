# Job Application Portal API

This repository contains a **RESTful API** developed using **Spring Boot**. The application provides APIs for managing job listings, companies, and user reviews, allowing for efficient job application management and review functionalities.

## Features

- Create, read, update, and delete job listings.
- Manage company details and perform CRUD operations on company data.
- Add, edit, and manage user reviews for jobs and companies.
- APIs to manage all entities.

## Main Entities

Each entity comes with its own endpoints for performing CRUD (Create, Read, Update, Delete) operations.
1. **Job**: Manages job listings and related information.
2. **Company**: Handles company details and related functionalities.
3. **Review**: Manages user reviews for companies and jobs.

## Technologies Used

The application is built using **Spring Boot** and leverages several key technologies to provide a robust and scalable backend:

### Key Technologies

- **Spring Web**: For creating RESTful APIs to manage job listings, companies, and reviews.
- **Spring Data JPA**: For interacting with the H2 in-memory database to perform CRUD operations.
- **Spring Actuator**: Provides monitoring and management endpoints to check the health and performance of the application.
- **H2 Database**: Used as an in-memory database for development and testing purposes.
- **Docker**: The app is containerized for easy deployment across different environments, ensuring consistent operation and simpler dependency management.

## API Endpoints

Each of the main entities have dedicated endpoints for managing data. Below is a brief overview:

### Company Endpoints
- `GET /companies`: Retrieve a list of all companies.
- `POST /companies`: Add a new company.
- `PUT /companies/{id}`: Update company details by ID.
- `DELETE /companies/{id}`: Delete a company by ID.

### Job Endpoints
- `GET /jobs`: Retrieve a list of all job listings.
- `POST /jobs`: Create a new job listing.
- `PUT /jobs/{id}`: Update a job listing by ID.
- `DELETE /jobs/{id}`: Delete a job listing by ID.

### Review Endpoints
- `GET /companies/{companyId}/reviews`: Retrieve all reviews for a specific company.
- `POST /companies/{companyId}/reviews`: Add a new review for a company.
- `PUT /companies/{companyId}/reviews/{reviewId}`: Update a specific review by ID.
- `DELETE /companies/{companyId}/reviews/{reviewId}`: Delete a review by ID.

## Deployment and Containerization
The entire application is containerized using **Docker**, allowing for:

- **Consistent deployment**: Ensure that the app runs the same across different environments (development, testing, production).
- **Simplified dependency management**: All dependencies are bundled within the container, making it easier to manage and deploy.

## Future Implementations
- **SQL Database** - PostgresSQL to be utilized next.
- **Microservices** - On Springboot using Spring Cloud.
- **Spring Security** - To secure the API & authenticate users.
- **Frontend** - To be developed and will be available soon.

## Contributing
Contributions are currently closed at the moment! 