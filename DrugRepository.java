package com.pharmacy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pharmacy.entity.Drug;

public interface DrugRepository extends JpaRepository<Drug, Long> {

	
}
