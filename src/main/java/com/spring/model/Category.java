package com.spring.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;


@Component
@Entity
public class Category {
	
	@Id
	@GeneratedValue
	@Column(name="category_id")
	private int id;
	
	@NotEmpty(message="Category details is mandatory")
	private String categoryName;
	 
	 @NotEmpty(message="Category Description is mandatory")
	 private String categoryDescription;

	
	 @OneToMany(fetch = FetchType.EAGER, mappedBy = "category", cascade = CascadeType.ALL)
	 private Set<Product> products = new HashSet<Product>();
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryDescription() {
		return categoryDescription;
	}
	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}
	

}
