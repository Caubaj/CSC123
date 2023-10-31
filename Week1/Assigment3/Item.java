import java.text.DecimalFormat;

public class Item {
	
	//cportillomedina1@toromail.csudh.edu
	
		public String itemName;
		public String vendor;
		public double price;
		public double cost;
		public double weight;
		public double taxRate;
		public double itemTax;
		
		public String author;
		public String pMonth;
		public int pages;
		
		public String sellBy;
		public String useBy;
		
		public DecimalFormat decfor = new DecimalFormat("0.00");
		
		
		// for publication items
		public Item(String name, double weigh, 
				String aut, String pMon, int pages, double price, double tax)
		{
			itemName = name;
			weight = weigh;
			author  = aut;
			pMonth = pMon;
			this.pages = pages;
			this.price = price;
			taxRate = tax;
		}
		
		// for food items
		public Item(String name, double wei, 
				double pr, double tax, String sell, String use)
		{
			itemName = name;
			weight = wei;
			price = pr;
			taxRate = tax;
			sellBy = sell;
			useBy = use;
		}
		
		//for genral grocery items
		public Item(String name, double wei, 
				double pr, double tax)
		{
			itemName = name;
			weight = wei;
			price = pr;
			taxRate = tax;
		}
		
		public double setTax()
		{
			
			double tax = price * (taxRate / 100); 
			return tax;
		}
		
		public String setTax2()
		{
			return decfor.format(price * (taxRate / 100));
		}
		
		public String setTotal()
		{	
			return decfor.format(setTax() + price);
		}
		
		public Double setTotal2()
		{	
			return setTax() + price;
		}
		public String toString()
		{
			return "Item: " + itemName + " | Price: $" + price + " | Item Tax: $" + setTax2() + " | Item Total: $" + setTotal();
		}

}
