package com.EKart.Company.Controller;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.EKart.Company.DTO.ProductDto;
import com.EKart.Company.Service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	ProductService productService;
	
	
	@GetMapping("findid/{id}")
	public ProductDto getProductbyId(@PathVariable long id) {
		return productService.getProductbyId(id);
	}

	@PostMapping("/addproduct")
	public ResponseEntity<ProductDto> addProduct(@RequestBody ProductDto ProductDto) {
		ProductDto prod = productService.addproduct(ProductDto);
		return ResponseEntity.ok(prod);
	}

	@PostMapping("/addbulkproducts")
	public ResponseEntity<List<ProductDto>> addBulkProducts(@RequestBody List<ProductDto> ProductDto) {
		List<ProductDto> prod = productService.addbulk(ProductDto);
		return ResponseEntity.ok(prod);

	}

}
