/*Q 5 wap to ask product name and price of product from user and calculate discount i.e 
if price > 2000 then discount is 10 percent of price 
else 
discount is 7 % of price*/



package Cop2;

import java.util.Scanner;

public class Product {
	String name;
	int price;
	
	void input()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter name");
		name= s.next();
		System.out.println("Enter price");
		price= s.nextInt();
	}
	void show()
	{
		System.out.println(name+" "+price);
	}
	void display()
	{
		if(price>2000)
		{
			System.out.println("Discount=10%");
		}
		else
		{
			System.out.println("Discount=7%");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product a= new Product();
		a.input();
		a.show();
		a.display();

	}

}
