package com.pharmacy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pharmacy.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
