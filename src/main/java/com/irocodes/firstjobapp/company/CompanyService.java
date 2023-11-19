package com.irocodes.firstjobapp.company;

import com.irocodes.firstjobapp.job.Job;

import java.util.List;

public interface CompanyService {
    //    All methods are defined here  are implemented on CompanyServiceImpl

    List<Company> findAllCompanies(); // Get all Companies

    boolean updateCompany(Long id, Company updatedCompany); // Update Company with {id}

}
