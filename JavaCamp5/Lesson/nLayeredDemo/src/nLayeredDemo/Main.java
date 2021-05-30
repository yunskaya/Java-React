package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.concretes.JLoggerAdapterManager;
import nLayeredDemo.dataAccess.concretes.AbcProductDao; 
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		
		//ToDo : spring Ioc ile çözülecek
		ProductService productService =new ProductManager(new AbcProductDao(),new JLoggerAdapterManager());
		
		Product product =new Product(1,2,"elma",12,50);
		productService.add(product);
	}

}
