package com.EKart.Company.Service;

import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.EKart.Company.DTO.ProductDto;
import com.EKart.Company.Dao.ProductDao;
import com.EKart.Company.Entities.Product;
import com.EKart.Company.Exceptions.ResourceNotFoundException;

@Service
public class ProductService {
	
	@Autowired
	ProductDao productDao;
	@Autowired
	ModelMapper model;
	
	public List<ProductDto> fetchAllProduct() {
	    List<Product> products = productDao.findAll();
	    return products.stream()
	                   .map(product -> model.map(product, ProductDto.class))
	                   .collect(Collectors.toList());
	}
	public ProductDto getProductbyId(long id) {
		Product product=  productDao.findById(id).orElseThrow(()-> new IllegalArgumentException("NOT FOUND"));
		return model.map(product, ProductDto.class);
	}
	
	public ProductDto addproduct(ProductDto productDto) {
		Product prod = model.map(productDto, Product.class);
		Product p1= productDao.save(prod);
		return model.map(p1, ProductDto.class);
	}
	public List<ProductDto> addbulk(List<ProductDto> productdto) {
		
		List<Product> list = 
				productdto.stream()
				.map(product -> model.map(productdto, Product.class))
				.collect(Collectors.toList());
				
		
		List<Product> prod = productDao.saveAll(list);
		
		List<ProductDto> rs= prod.stream()
                .map(product -> model.map(product, ProductDto.class))
                .collect(Collectors.toList());
		return rs;
		
	}
	

}
