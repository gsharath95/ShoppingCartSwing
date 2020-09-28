package com.isi.shopping;

import com.isi.shopping.controller.ProductController;
import com.isi.shopping.model.Product;
//import com.isi.shopping.view.LoginWindow;
import com.isi.shopping.view.ProductWindow;

public class Main {

	public static void main(String[] args) {
		
		//LoginWindow login = new LoginWindow();
		//login.setVisible(false);
				
		//Product product = new Product("Abc", "xyz", "qweretet", 1.5, 25, 0.0);
//		Product product2 = new Product("xyz", "def", "kgkjgkj", 20.5, 55, 1.0);
//		
//		Product product = new Product();
//		product.addProduct("Apple","Fruit","Small red Apple",1.12,20,0.00);
//		
		Product[] products = createProductsArray();
		ProductController controller = new ProductController(products);
		
		ProductWindow window = new ProductWindow(products, controller);
		window.setVisible(true);
	}
	
	//	private static HashMap<Integer, Product> createProductsHashMap(Product[] productsArray)
	//	{
	//		HashMap<Integer, Product> products = new HashMap<Integer, Product>();
	//		for(Product product : productsArray)
	//			products.put(product.getProductId(),product);
	//		return products;
	//	}
	
	private static Product[] createProductsArray() 
	{
		Product[] productsArray = new Product[]
		{
			new Product("Apple","Fruit","Small red Apple",1.12,20,0.00),
			new Product("Mango","Fruit","Organic green Mango",2.00,25,0.00),
			new Product("Orange","Fruit","Indian Orange",1.50,30,0.00)
		};
		return productsArray;
	}

}
