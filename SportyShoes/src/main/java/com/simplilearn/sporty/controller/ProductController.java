package com.simplilearn.sporty.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.sporty.entity.Product;
import com.simplilearn.sporty.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@PostMapping("/products")
	public Product addProduct(@RequestBody Product product) {
		return service.saveProduct(product);
	}
	
	@GetMapping("/products")
    public List<Product> findAllProducts() {
        return service.getProducts();
    }

    @GetMapping("/products/{pid}")
    public ResponseEntity<Object> getProductById(@PathVariable int pid) {
    	Product obj= service.getProductById(pid);
    	if(obj!=null)
        return new ResponseEntity<Object>(obj,HttpStatus.FOUND);
    	else
    		return new ResponseEntity<Object>("No product available with this id",HttpStatus.NOT_FOUND);
        
    	}

    @GetMapping("/product/{name}")
    public Product findProductByName(@PathVariable String name) {
        return service.getProductByName(name);
    }

    @PutMapping("/products/{pid}")
    public ResponseEntity<Object> updateProduct(@RequestBody Product product, @PathVariable int pid){
    	Product obj = service.updateProduct(product,pid);
    	if(obj!=null)
    		return new ResponseEntity<Object>(obj,HttpStatus.OK);
    	else 
    		return new ResponseEntity<Object>("No product available to update",HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/products/{pid}")
    public ResponseEntity<Object> deleteProduct(@PathVariable int pid) {
       if(service.deleteProduct(pid))
    		   return new ResponseEntity<Object>("Product deleted",HttpStatus.OK);
       else 
    	   return new ResponseEntity<Object>("No product found to delete",HttpStatus.NOT_FOUND);
    }
}

