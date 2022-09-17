package com.simplilearn.sporty.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.sporty.entity.Product;
import com.simplilearn.sporty.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repo;
	
	public Product saveProduct(Product product) {
		return repo.save(product);
	}

    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product getProductById(int pid) {
    	if(repo.findById(pid).isPresent()) 
        return repo.findById(pid).get();
    	else
    		return null;
    }

    public Product getProductByName(String name) {
        return repo.findByProductName(name);
    }

    public boolean deleteProduct(int pid) {
    	if(repo.findById(pid).isPresent()) {
        repo.deleteById(pid);
        return true;
    	}
    	return false;

    }

    public Product updateProduct(Product product,int pid) {
    	if(repo.findById(pid).isPresent()) {
        Product existingProduct = repo.findById(pid).get();
        existingProduct.setProductName(product.getProductName());
        existingProduct.setCategory(product.getCategory());
        existingProduct.setDate(product.getDate());
        return repo.save(existingProduct);
    }
    	else
    		return null;

    }
}
