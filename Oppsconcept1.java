package com.tns.prog;

public class Oppsconcept1
{
	int year_ofpurchase;
	String make;
	int model;
	double cost;
	public void display1()
	{
		System.out.println("year of purchase "+2001);
		System.out.println("make " +"Suzuki");
	}
	
    void disp2() 
    {
    	System.out.println("model " +1999);
    	System.out.println("make " +500000);
    }
    
    public static void main(String[]args) {
    	
    	Oppsconcept1 ob1 = new Oppsconcept1();
    	Oppsconcept1 ob2 = new Oppsconcept1();
    	ob1.display1();
    	ob2.disp2();
    }

}
