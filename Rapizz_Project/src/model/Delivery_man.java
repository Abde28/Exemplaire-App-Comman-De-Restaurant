package model;

public class Delivery_man {
	
	private String last_name;
	private String first_name;
	private String tel_num;
	Delivery_method delivery_method;
	
	public Delivery_man(String last_name, String first_name, String tel_num, Delivery_method delivery_method)
	{
		
		this.last_name = last_name;
		this.first_name = first_name;
		this.tel_num = tel_num;
		this.delivery_method = delivery_method;
		
	}
	
	// Création + modifications des attributs
	
	public String getLastName()
	{
		return last_name;
	}
	
	public void setLastName(String last_name)
	{
		this.last_name = last_name;
	}
	
	public String getFirstName()
	{
		return first_name;
	}
	
	public void setFirstName(String first_name)
	{
		this.first_name = first_name;
	}
	
	public String getTelNum()
	{
		return tel_num;
	}
	
	public void setTelNum(String tel_num)
	{
		this.tel_num = tel_num;
	}
	
	
}

class Delivery_method 
{
	String method;
	
	public Delivery_method(String method)
	{
		this.method = method;
	}
	
	public String getMethod()
	{
		return method;
	}
	
	public void setMethod(String method)
	{
		this.method = method;
	}
}