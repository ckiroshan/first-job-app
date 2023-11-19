package com.irocodes.firstjobapp.company;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
    // Spring data JPA will auto-generate all implementations at runtime.
}
