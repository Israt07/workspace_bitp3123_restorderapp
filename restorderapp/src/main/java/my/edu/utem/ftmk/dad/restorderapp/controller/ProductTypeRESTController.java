package my.edu.utem.ftmk.dad.restorderapp.controller;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.edu.utem.dad.restorderapp.model.ProductType;
import my.edu.utem.ftmk.dad.restorderapp.repository.ProductTypeRepository;

@RestController
	@RequestMapping("/api/producttypes")
	public class ProductTypeRESTController {

	    @Autowired
	    private ProductTypeRepository productTypeRepository;

	    @GetMapping("/")
	    public List<ProductType> getProductTypes() {
	        return productTypeRepository.findAll();
	    }

	    @GetMapping("/{productTypeId}")
	    public ProductType getProductType(@PathVariable Long productTypeId) {
	        return productTypeRepository.findById(productTypeId).orElse(null);
	    }

	    @PostMapping("/")
	    public ProductType insertProductType(@RequestBody ProductType productType) {
	        return productTypeRepository.save(productType);
	    }

	    @PutMapping("/{productTypeId}")
	    public ProductType updateProductType(@PathVariable Long productTypeId, @RequestBody ProductType productType) {
	        ProductType existingProductType = productTypeRepository.findById(productTypeId).orElse(null);
	        if (existingProductType != null) {
	            existingProductType.setName(productType.getName());
	            return productTypeRepository.save(existingProductType);
	        }
	        return null;
	    }

	    @DeleteMapping("/{productTypeId}")
	    public ResponseEntity<HttpStatus> deleteProductType(@PathVariable Long productTypeId) {
	        ProductType existingProductType = productTypeRepository.findById(productTypeId).orElse(null);
	        if (existingProductType != null) {
	            productTypeRepository.delete(existingProductType);
	            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	        }
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	}



