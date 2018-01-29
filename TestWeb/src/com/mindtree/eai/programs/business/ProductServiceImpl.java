package com.mindtree.eai.programs.business;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl 
{
	ArrayList<String> books = new ArrayList<>();
	ArrayList<String> movies = new ArrayList<>();
	ArrayList<String> music = new ArrayList<>();
	
	public ProductServiceImpl()
	{
		books.add("OnePiece");
		books.add("Naruto");
		books.add("Bleach");
		
		movies.add("PiratesOfCarrabian");
		movies.add("WorldWar");
		movies.add("DragonBall");
		
		music.add("LinkenPark");
		music.add("Beatels");
		music.add("BackstreetBoys");
	}
	
	
	public List<String> getProductCategories()
	{
		List<String> Categories = new ArrayList<>();
		Categories.add("Books");
		Categories.add("Movies");
		Categories.add("Music");
		return Categories;
	}
	
	public List<String> getProducts(String category)
	{
		switch(category.toLowerCase())
		{
		case "books":
			return books;
		case "movies":
			return movies;
		case "music":
			return music;
		}
		return null;
	}


	public boolean addProduct(String category, String product) 
	{
		switch(category.toLowerCase())
		{
		case "books":
			books.add(product);
			break;
		case "movies":
			movies.add(product);
			break;
		case "music":
			music.add(product);
			break;
		default:return false;
		}
		return true;
	}

}
