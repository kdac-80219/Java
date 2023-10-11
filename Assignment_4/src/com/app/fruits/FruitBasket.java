package com.app.fruits;
import java.util.*;
class Fruit
{
	private String name;
	private String color;
	private double weight;
	private boolean isFresh=true;
	Scanner sc = new Scanner(System.in);
	public Fruit()
	{
		
	}

	public Fruit(String name, String color, double weight, boolean isFresh) {
		super();
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.isFresh = isFresh;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isFresh() {
		System.out.println("Is fruits are fresh?");
		this.isFresh = sc.nextBoolean();
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	public boolean getFresh() {
		return this.isFresh ;
	}

	public String Taste()
	{
		String str;
		str = "no specific taste";
		return str;
	}
	public void accept()
	{
		System.out.println("Enter Name of Fruit = ");
		this.name = sc.next();
		System.out.println("Enter Color of Fruit = ");
		this.color = sc.next();
		System.out.println("Enter Weight = ");
		this.weight = sc.nextDouble();
		System.out.println();
	
	}
	
	public void display()
	{
		System.out.println("Name of fruit = "+this.name);
		System.out.println("Color of fruit = "+this.color);
		System.out.println("Weight = "+this.weight);
		System.out.println("Is Fresh ? - "+this.isFresh);
		this.Taste();
	}
	
}

class Apple extends Fruit
{
	public Apple()
	{
		
	}
	public Apple(String name, String color, double weight, boolean isFresh)
	{
		super();
	}
	public void accept()
	{
		super.accept();
	}
	public void display()
	{
		super.display();
		this.Taste();
	
	}
	public String Taste()
	{
		String str;
		str = "sweet n sour";
		return str;
	}
	
	
}

class Orange extends Fruit
{
	public Orange()
	{
		
	}
	public Orange(String name, String color, double weight, boolean isFresh)
	{
		super();
	}
	public void accept()
	{
		super.accept();
	}
	public void display()
	{
		super.display();
		this.Taste();
	}
	public String Taste()
	{
		String str;
		str = "sour";
		return str;
	}
	
	
}

class Mango extends Fruit
{
	public Mango()
	{
		
	}
	public Mango(String name, String color, double weight, boolean isFresh)
	{
		super();
	}
	public void accept()
	{
		super.accept();
	}
	public void display()
	{
		super.display();
		this.Taste();
	}
	public String Taste()
	{
		String str;
		str = "sweet";
		return str;
	}
	
}

 
public class FruitBasket 
{
	
	public static int menu()
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("0. EXIT");
		System.out.println("1. Add Mango");
		System.out.println("2. Add Orange ");
		System.out.println("3. Add Apple");
		System.out.println("4. Display All fruits in Basket");
		System.out.println("5. Display name,color,weight , taste of all fresh fruits , in the basket");
		System.out.println("Enter Your Choice = ");
		choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) 
	{
		int size,choice;
		Fruit f = new Fruit();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Basket = ");
		size = sc.nextInt();
		Fruit []basket=new Fruit[size];
		int counter=0;
		
		
		while((choice=menu())!=0)
		{
			switch(choice)
			{
			case 1 : 
				if(counter<size)
				{
					basket[counter] = new Mango();
					basket[counter].isFresh();
					basket[counter].accept();
					counter++;
				}
				else
					System.out.println("Basket is Full!!!!");
				
				break;
			
			case 2 :
				if(counter<size)
				{
					basket[counter] = new Orange();
					basket[counter].isFresh();
					basket[counter].accept();
					counter++;
				}
				else
					System.out.println("Basket is Full!!!!");
				break;
				
			case 3 :
				if(counter<size)
				{
					basket[counter] = new Apple();
					basket[counter].isFresh();
					basket[counter].accept();
					counter++;
				}
				else
					System.out.println("Basket is Full!!!!");
				break;
					  
			case 4 :
				for(int i=0;i<counter;i++)
				{
					System.out.println("Name of Fruit = "+basket[i].getName());
					 
				}
				break;
			
			case 5:
				for(int i=0;i<counter;i++)
				{
					basket[i].display();
					System.out.println(basket[i].Taste());
					System.out.println();
				}
				break;
				
			case 6: 
				for(int i=0;i<counter;i++)
				{
					if(!(basket[i].getFresh()))
					{
						basket[i].display();
					}
				}
				break;
				
			case 7:
				int index;
				System.out.println("Enter Index to set Stale = ");
				index = sc.nextInt();
				basket[index].setFresh(false);
	
					if(!(basket[index].getFresh()))
					{
						basket[index].display();
					}
					else
					{
						System.out.println("Wrong Index");
					}
				break;
				
			default: System.out.println("Wrong choice!!!!");
						break;
			
			}
		}
		
		System.out.println("THANK YOU.!!!  :)");
		
	}

 }

