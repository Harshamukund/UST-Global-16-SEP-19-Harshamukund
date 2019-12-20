package com.ustglobal.stockmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.stockmanagement.bean.ProductBean;
import com.ustglobal.stockmanagement.bean.ProductResponse;
import com.ustglobal.stockmanagement.service.ProductService;


@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
@RestController
public class ProductController {

	@Autowired
	private ProductService service;
	
	private final int success_code=201;
	private final int fail_code=401;
	
	@PutMapping(path = "/addProduct",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse addProduct(@RequestBody ProductBean bean) {
		ProductResponse response = new ProductResponse();
		if(service.addProdct(bean)){
			response.setStatus_code(success_code);
			response.setMessage("Product Added Successfully");
			return response;
		}else {
			response.setStatus_code(fail_code);
			response.setMessage("Product is Not Added");
			return response;
		}
	}
	
	@PutMapping(path = "/updateProduct",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse updateProduct(@RequestBody ProductBean bean) {
		ProductResponse response = new ProductResponse();
		if(service.updateproduct(bean)){
			response.setStatus_code(success_code);
			response.setMessage("Product Updated Successfully");
			return response;
		}else {
			response.setStatus_code(fail_code);
			response.setMessage("Product is Not Updated");
			return response;
		}
	}
	
	@GetMapping(path = "/get-all",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse getAll() { 
		ProductResponse response= new ProductResponse();
		List<ProductBean> list=service.getAllProducts();
		if(list != null) {
			response.setStatus_code(success_code);
			response.setMessage("Products are");
			response.setBean(list);
			return response;
		}else {
			response.setStatus_code(fail_code);
			response.setMessage("Items Not There");
			return response;
		}
	}
	
	@PostMapping(path = "/generate/{total}/{total_gst}",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse generateBill(@RequestBody List<ProductBean> beans,
			@PathVariable("total") double total,
			@PathVariable("total_gst") double total_gst) { 
		ProductResponse response= new ProductResponse();
		List<ProductBean> list=service.getAllProducts();
		if(service.generateBill(beans, total, total_gst)) {
			response.setStatus_code(success_code);
			response.setMessage("Ordered Success");
			response.setBean(list);
			return response;
		}else {
			response.setStatus_code(fail_code);
			response.setMessage("Items Not Ordered");
			return response;
		}
	}
	
	
}
