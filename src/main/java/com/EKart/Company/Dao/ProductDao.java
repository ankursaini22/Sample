package com.EKart.Company.Dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.EKart.Company.Entities.Product;

public interface ProductDao extends JpaRepository<Product, Long> {
	
	public Product findByproductId(long productId);
	
	
}
