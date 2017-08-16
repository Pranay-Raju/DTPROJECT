package com.spring.dao;

import com.spring.model.Cart;

public interface CartDAO {
	
	
	public boolean saveProductToCart(Cart cart);
	
	public Cart getitem(int prodId,int userId);

}
