package com.spring.model;

import javax.persistence.*; 
@Entity
public class Product {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String description;
	private double price;
	private int instock;
	@Column(name="category_id", insertable=false, updatable=false)
	private int category_id;
	
	
	@Column(name="supplier_id", insertable=false, updatable=false)
	private int supplier_id;
	
	
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public int getSupplier_id() {
		return supplier_id;
	}
	public void setSupplier_id(int supplier_id) {
		this.supplier_id = supplier_id;
	}

	
	
	 @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	   @JoinColumn(name = "category_id", nullable = false)
	    private Category category;

	 
	 
	 
	 @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	   @JoinColumn(name = "supplier_id", nullable = false)
	 private Supplier supplier;
	 
	 
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getInstock() {
		return instock;
	}
	public void setInstock(int instock) {
		this.instock = instock;
	}

}
