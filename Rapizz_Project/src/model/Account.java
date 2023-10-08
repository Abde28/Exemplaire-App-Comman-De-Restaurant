package model;

public class Account 
{
	
	private String last_name;
	private String first_name;
	private String tel_num;
	private double sold;
	
	public Account(String last_name, String first_name, String tel_num, double sold) 
	{
		
		this.last_name = last_name;
		this.first_name = first_name;
		this.tel_num = tel_num;
		this.sold = sold;
		
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
	
	// Tout ce qui est en dessous concerne le solde + son évolution

	public double getSold() {
		return sold;
	}

	public void setSold(double sold) {
		this.sold = sold;
	}
	
	// Calcul du solde que soit ajouter ou retirer
	
	public void add(double a)
	{
		this.sold += a;
	}
	
	public void remove(double r)
	{
		this.sold -= r;
	}
	
	// Permet d'afficher le solde
	
	public void printSold()
	{
		System.out.println("Le Solde actuel est de " + this.sold + " euros ");
	}
}



