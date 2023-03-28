package com.pharmacy.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.pharmacy.entity.SaleHistory;



public interface SaleHistoryRepository extends JpaRepository<SaleHistory,Long > {



}
