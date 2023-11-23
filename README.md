# Job Application App

This repository contains a Job Application App developed using Spring Boot. The application provides APIs for managing job listings, companies, and user reviews. It leverages the following technologies:

- **Java Version:** 17
- **Description:** Job application project for Spring Boot
- **Dependencies:**
  - `spring-boot-starter-web`
  - `spring-boot-starter-data-jpa`
  - `h2`
  - `spring-boot-starter-actuator`
  - `spring-boot-starter-test`

## Project Structure

The app is organized into three main packages:

1. **Job:** Manages job listings and related information.
2. **Company:** Handles company details and related functionalities.
3. **Review:** Manages user reviews for companies and jobs.

Each package contains separate endpoints for performing CRUD (Create, Read, Update, Delete) operations.

## Docker Containerization

The entire application has been containerized using Docker. Containerization ensures consistent deployment across different environments, making it easier to manage dependencies and deploy the app seamlessly.

## Usage

To run the application, follow these steps:

1. Ensure you have Docker installed on your system.
2. Clone this repository to your local machine.
3. Open a terminal in the project directory.
4. Run the following Docker command to build the image:
   ```bash
   docker build -t job-application-app .
5. After the build is complete, run the Docker container:
   ```bash
   docker run -p 8080:8080 job-application-app

The application will be accessible at http://localhost:8081.

## Database
The app uses H2 as the in-memory database for development and testing purposes. You can access the H2 console at http://localhost:8080/h2-console. Make sure to configure the JDBC URL as jdbc:h2:mem:testdb when prompted.

## Frontend (Coming Soon)
The frontend for the Job Application App is currently under development and will be available soon.

Feel free to explore and contribute to the project. If you have any questions or feedback, please open an issue or reach out to the project maintainers. Thank you for your interest!
