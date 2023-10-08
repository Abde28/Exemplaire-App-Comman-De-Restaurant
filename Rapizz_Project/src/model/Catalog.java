package model;

public class Catalog
{
	Pizza pizza_name;
	Drinks drink_name;
	double price;
	
	public Catalog(Pizza pizza_name, Drinks drink_name, double price) 
	{
		this.pizza_name = pizza_name;
		this.drink_name = drink_name;
		this.price = price;
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