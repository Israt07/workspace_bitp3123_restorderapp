package my.edu.utem.dad.restorderapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="producttype")
public class ProductType {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column (name="productTypeId")
	    private int productTypeId; // unique id

@Column (name="price")
	    private int price; // price of products 

@Column (name="name")
	    private String name; // name of the product type
	    
	    // default constructor
	    public ProductType() {
	    }
	    
	    // constructor with 
	    public ProductType(int productTypeId, int price, String name) {
	        this.productTypeId = productTypeId;
	        this.price = price;
	        this.name = name;
	    }

	    // getters and setters 
	    public int getProductTypeId() {
	        return productTypeId;
	    }

	    public void setProductTypeId(int productTypeId) {
	        this.productTypeId = productTypeId;
	    }

	    public int getPrice() {
	        return price;
	    }

	    public void setPrice(int price) {
	        this.price = price;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }
	    
	}



