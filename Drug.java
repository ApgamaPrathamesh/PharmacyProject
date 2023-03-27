package com.pharmacy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Drug")
public class Drug {

	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;

	    private String name;

	    private String type;

	    public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getBarcode() {
			return barcode;
		}
		public void setBarcode(String barcode) {
			this.barcode = barcode;
		}
		public String getDose() {
			return dose;
		}
		public void setDose(String dose) {
			this.dose = dose;
		}
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public double getCost_price() {
			return cost_price;
		}
		public void setCost_price(double cost_price) {
			this.cost_price = cost_price;
		}
		public double getSelling_price() {
			return selling_price;
		}
		public void setSelling_price(double selling_price) {
			this.selling_price = selling_price;
		}
		public String getExpiry() {
			return expiry;
		}
		public void setExpiry(String expiry) {
			this.expiry = expiry;
		}
		public String getCompany_name() {
			return company_name;
		}
		public void setCompany_name(String company_name) {
			this.company_name = company_name;
		}
		public String getProduction_date() {
			return production_date;
		}
		public void setProduction_date(String production_date) {
			this.production_date = production_date;
		}
		public String getExpiration_date() {
			return expiration_date;
		}
		public void setExpiration_date(String expiration_date) {
			this.expiration_date = expiration_date;
		}
		public String getPlace() {
			return place;
		}
		public void setPlace(String place) {
			this.place = place;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		private String barcode;

	    private String dose;
	    private String code;
	    private double cost_price;
	    private double selling_price;
	    private String expiry;
	    private String company_name;
	    private String production_date;
	    private String expiration_date;
	    private String place;
	    private int quantity;
	    
	    
	    
}
