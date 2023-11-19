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

}
