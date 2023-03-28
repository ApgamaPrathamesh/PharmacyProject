package com.pharmacy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pharmacy.entity.SaleHistory;
import com.pharmacy.repository.SaleHistoryRepository;

@RestController
@RequestMapping("/sale/history")
public class SaleHistoryController {

		    @Autowired
		    private SaleHistoryRepository salehistoryRepository;
		
		    @GetMapping
		    public List<SaleHistory> getAllDrug(){
		 	    return salehistoryRepository.findAll();
		     }
//		    @PostMapping
//	       public SaleHistory createSaleHistory(@RequestBody SaleHistory salehistory) {
//		        return salehistoryRepository.save(salehistory);
//		    }
		     @PostMapping
			    public ResponseEntity<?> addSaleHistory(@RequestBody SaleHistoryRepository salehistory) {
			        try {
			            SaleHistoryRepository savedSaleHistory= salehistoryRepository.save(salehistory);
			            return ResponseEntity.ok(savedSaleHistory);
			        } catch (Exception e) {
			            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error adding SaleHistory");
			        }
			    }	
}
