package com.niit.shoppingcart;

public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product product = new Product();
		
		product.setId("Prd001");
		product.setName("Mobile phone");
		product.setPrice(11999);
		
		System.out.println("Product Id : " + product.getId());
		System.out.println("Product Name : " + product.getName());
		System.out.println("Product Price : " + product.getPrice());
		

	}

}
