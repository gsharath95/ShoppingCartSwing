package com.isi.shopping.controller;

import com.isi.shopping.model.Product;
import com.isi.shopping.view.ProductWindow;

public class ProductController {

//	private final Product product;
//	private final ProductWindow window;
	
	private Product[] productsArray;
	
	public ProductController(Product[] productsArray)	//Product product, ProductWindow window
	{
		this.productsArray = productsArray;
//		this.product = product;
//		this.window = window;
	}
}
