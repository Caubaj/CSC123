import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {

	public static void main(String[] args) 
	
	{
		
		//cportillomedina1@toromail.csudh.edu
		
				ArrayList <String> cart = new ArrayList<String>();	
				int x = 0;
				byte add;
				byte type;
				
				String name;
			//	String vendor = "N/A";
				double price;
			//	double cost;
				double weight;
				double taxRate;
				double total = 0;
				
				String author;
				String pMonth;
				int pages;
				
				String sellBy;
				String useBy;
				
				
				Scanner scan = new Scanner(System.in);
				
				while(x != -1)
				{
					System.out.println("Would you like to add an item to your cart?\n Press 1 for Yes | Press 2 to exit | Press 3 to view cart");
					add = scan.nextByte();
						while(add != 1 && add != 2 && add != 3)
						{
							System.out.println("Error! Please try again!");
							System.out.println("Would you like to add an item to your cart?\n Press 1 for Yes | Press 2 to exit | Press 3 to view cart");
							add = scan.nextByte();
						}
					if(add == 1)
					{
						System.out.println("Is your item a publication, food, or general grocery item?\n Type 1 for publication | 2 for food | 3 for general grocery item" );
						type = scan.nextByte();
						scan.nextLine();
						
						if(type == 1)
						{
							System.out.println("What is the name of your item?");
							name = scan.nextLine();
							
							System.out.println("What is the weight of your item? (in pounds)");
							weight = scan.nextDouble();
							
							System.out.println("Who is the author of your item?");
							author = scan.nextLine();
							scan.nextLine();
							
							System.out.println("What is the publication month of your item?");
							pMonth = scan.nextLine();
							
							System.out.println("How many pages does your item have?");
							pages = scan.nextInt();
							
							System.out.println("What is the price of your item?");
							price = scan.nextDouble(); 
							
							System.out.println("What is the tax rate of your item?");
							taxRate = scan.nextDouble(); 
							
							Item item = new Item(name, weight, author, pMonth, pages, price, taxRate);
							
							cart.add(item.toString());
							
							total = total + item.setTotal2();	
						}
						else if (type == 2)
						{
						System.out.println("What is the name of your item?");
						name = scan.nextLine();
						
						System.out.println("What is the weight of your item? (in pounds)");
						weight = scan.nextDouble();
						
					//  System.out.println("Who is the vendor of your Item?");
					//	vendor = scan.nextLine(); 
						
						System.out.println("What is the price of your item?");
						price = scan.nextDouble(); 
						
					//	System.out.println("What is the cost of your item?");
					//	cost = scan.nextDouble(); 
						
						System.out.println("What is the tax rate of your item?");
						taxRate = scan.nextDouble(); 
						
						System.out.println("When does your item sell by?");
						sellBy = scan.nextLine(); 
						scan.nextLine();
						
						System.out.println("When should your item be used by?");
						useBy = scan.nextLine(); 
						
						Item item = new Item(name, weight, price, taxRate, sellBy, useBy);
						
						cart.add(item.toString());
						
						total = total + item.setTotal2();
						
						
						}
						else if (type == 3)
						{
							
							System.out.println("What is the name of your item?");
							name = scan.nextLine();
							
							System.out.println("What is the weight of your item? (in pounds)");
							weight = scan.nextDouble();
							
						//  System.out.println("Who is the vendor of your Item?");
						//	vendor = scan.nextLine(); 
							
							System.out.println("What is the price of your item?");
							price = scan.nextDouble(); 
							
						//	System.out.println("What is the cost of your item?");
						//	cost = scan.nextDouble(); 
							
							System.out.println("What is the tax rate of your item?");
							taxRate = scan.nextDouble(); 
							
							Item item = new Item(name, weight, price, taxRate);
							
							cart.add(item.toString());
							
							total = total + item.setTotal2();	
						}	
					}
					if(add == 2)
					{
						System.out.println("Thank You for using cart! Have a fantastic Day!");
						x = -1;	
					}
					if(add == 3)
					{
						System.out.println();
						System.out.println("You have " + cart.size() + " item(s) in your cart.");
						
						for (int y = 0; y < cart.size(); y++)
						{
							System.out.println(cart.get(y));	             	
						}
						System.out.printf("\nCart total: $%.2f\n" , total);		
					}
					
				}
				
		

	}

}
