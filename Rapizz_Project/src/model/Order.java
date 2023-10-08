package model;

public class Order 
{
	String order_id;
	Pizza pizza_name;
	Size pizza_size;
	Drinks drink_name;
	int commanded_quantity;
	double total_price;
	
	public Order(String order_id, Pizza pizza_name, Size pizza_size, Drinks drink_name, int commanded_quantity, double total_price) 
	{
		this.order_id = order_id;
		this.pizza_name = pizza_name;
		this.pizza_size = pizza_size;
		this.drink_name = drink_name;
		this.commanded_quantity = commanded_quantity;
		this.total_price = total_price;
	}
	
	public String getOrderId()
	{
		return order_id;
	}
	
	public void setOrderId(String order_id)
	{
		this.order_id = order_id;
	}
	
	public int getCommandedQuantity()
	{
		return commanded_quantity;
	}
	
	public void setCommandedQuantity(int commanded_quantity)
	{
		this.commanded_quantity = commanded_quantity;
	}
	
	public double getTotalPrice()
	{
		return total_price;
	}
	
	public void setTotalPrice(double total_price)
	{
		this.total_price = total_price;
	}
}

class Size
{
	String size_name;
	
	public Size(String size_name) 
	{
		this.size_name = size_name;
	}
	
	public String getSizeName()
	{
		return size_name;
	}
	
	public void setSizeName(String size_name)
	{
		this.size_name = size_name;
	}
}