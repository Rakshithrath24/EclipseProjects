package com.mindtree.eai.programs;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.mindtree.eai.programs.business.ProductServiceImpl;



@WebService(targetNamespace = "http://programs.eai.mindtree.com/", portName = "ProductCatPort", serviceName = "ProductCatService")
public class ProductCat 
{
	ProductServiceImpl service = new ProductServiceImpl();
	@WebMethod(operationName = "getProductCategories", action = "urn:GetProductCategories")
	public java.util.List<java.lang.String> getProductCategories()
	{
		return service.getProductCategories();
	}            
	

	@WebMethod(operationName = "getProducts", action = "urn:GetProducts")
	public List<String> getProducts(String category)
	{
		return service.getProducts(category);
	}
	

	@WebMethod(operationName = "addProduct", action = "urn:AddProduct")
	public boolean addProduct(String category,String product)
	{
		return service.addProduct(category,product);
	}
	
}
  