package com.irocodes.firstjobapp.company;

import java.util.List;

public interface CompanyService {
    //    All methods are defined here  are implemented on CompanyServiceImpl

    List<Company> findAllCompanies(); // Get all Companies

    boolean updateCompany(Long id, Company updatedCompany); // Update Company with {id}

    void createCompany(Company company); // Create a new Company

    boolean deleteCompanyById(Long id); // Delete Company with {id}

    Company getCompanyById(Long id); // Get Company by {id}

}
