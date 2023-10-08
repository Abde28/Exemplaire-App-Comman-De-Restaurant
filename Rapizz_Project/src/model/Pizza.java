package model;

import view.Purchase;

public class Pizza 
{
	String name;
	String size;
	double price;
	
	public Pizza(String name, String size, double price) 
	{
		this.name = name;
		this.size = size;
		this.price = price;
	}
	
	// Création + modifications des attributs
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getSize()
	{
		return size;
	}
	
	public void setSize(String size)
	{
		this.size = size;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}

	
	
}