package com.irocodes.firstjobapp.company;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companies")
public class CompanyController {
    private CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    // Get all Companies
    @GetMapping
    public ResponseEntity<List<Company>> findAllCompanies() {
        return ResponseEntity.ok(companyService.findAllCompanies());
    }

    // Update existing Company by ID
    @PutMapping("/{id}")
    public ResponseEntity<String> updateCompany(@PathVariable Long id, @RequestBody Company updatedCompany) {
        boolean updated = companyService.updateCompany(id,updatedCompany);
        if(updated) {
            return new ResponseEntity<>("Company updated successfully!",HttpStatus.OK);
        }
        // If Company ID not found! will return
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // Create a new Company
    @PostMapping
    public ResponseEntity<String> createCompany(@RequestBody Company company) {
        companyService.createCompany(company);
        return new ResponseEntity<>("Company added successfully!", HttpStatus.CREATED);
    }

    // Delete existing Company by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCompany(@PathVariable Long id) {
        boolean deleted = companyService.deleteCompanyById(id);
        if (deleted) {
            return new ResponseEntity<>("Company deleted successfully!", HttpStatus.OK);
        }
        // If Job ID not found! will return
        return new ResponseEntity<>("Company not found!",HttpStatus.NOT_FOUND);
    }

    // Get Company by ID
    @GetMapping("/{id}")
    private ResponseEntity<Company> getCompanyById(@PathVariable Long id) {
        Company company = companyService.getCompanyById(id);
        if (company != null) {
            return new ResponseEntity<>(company, HttpStatus.OK);
        }
        // If Job ID not found! will return
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
