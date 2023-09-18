package com.casestudy.cataloguemgmt.productcatalogueservice1.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casestudy.cataloguemgmt.productcatalogueservice1.Model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	
 
}