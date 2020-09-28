package com.isi.shopping.model;

import java.util.ArrayList;

import com.isi.shopping.interfaces.IProductListener;

public class Product 
{
	private static int nextProductId = 101;
	
	private final int productId;
	private final String name;
	private final String category;
	private final String description;
	private final double price;
	
	private int quantity;
	
	private double discount;
	
	ArrayList<Product> productslist = new ArrayList<Product>();
	private ArrayList<IProductListener> listener;
	
	
//	public void addProduct(String name, String category, String description, double price, int quantity, double discount)
//	{
//		//Product product = new Product(name, category);
//		
//		productslist.add(name);
//		
//	}
	public Product(String name, String category, String description, double price, int quantity, double discount)
	{
		productId = Product.nextProductId++;
		this.name = name;
		this.category = category;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
		
		this.discount = discount;
		
		listener = new ArrayList<IProductListener>();
	}
	
	////getters
	public String getName(){ return name; }
	public String getCategory(){ return category; }
	public String getStringdescription(){ return description; }
	public double getPrice(){ return price;	}
	public int getQuantity() { return quantity; }
	public double getDiscount(){ return discount; }
	
	////setters
	//private void setName(){ }
	
	////otherMethods
	public void addProductListener(IProductListener listener) 
	{
		//listners.add(listener);
	}

	@Override
	public String toString() 
	{
		return "Product id: " + productId + ", Name: " + name +
				", Category: " + category + ", Description: "
				+ description + ", Price: " + price + 
				", Quantity: " +quantity+ ", Discount: " + 
				discount;
	}
}
