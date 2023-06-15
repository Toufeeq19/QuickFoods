package QuickFoods.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class quickFo {
	//Variable used to store the driver once extracted from the file
	static String driver;
	public static void main(String[] args) {
		//Fill the attributes with the information for both classes
		customer jill = new customer(1234,"Jill Jack","123 456 7890 ","12 Cherry Road Plumstead","Cape Town","jilljack@yahoo.com");
		restaurant pizza = new restaurant("Aesop's Pizza", "Cape Town", "098 765 4321", "Pepperoni pizza", 1, 78, "Extra tomato base on the Pepperoni pizza", 78);

		String location = jill.getCustLocation();
		
		try {
			//More descriptive input variables
			File driversTxtFile = new File("../../drivers.txt");
			Scanner look = new Scanner(driversTxtFile);
			
		    double smallest = Double.MAX_VALUE; 
		    double currentInt=0;
		    String current = ""; 
		    int firstComma;
		    int secondComma;
		    
		    String search = look.nextLine();
		    while(look.hasNextLine()) {
		    	//Ensuring driver location matches restaurant location
		    	if(search.contains(location)) {
		    		//Finding the last character in the string to get the number representing the load of the driver
		    		firstComma = search.indexOf(',');		    		
		    		secondComma = search.indexOf(',', firstComma + 1);		    		
		    		current = search.substring(secondComma+1, search.length());
		    		if (current=="") {
		    			currentInt=0;
		    		}
		    		else {
		    			currentInt = Double.parseDouble(current);
		    		}
		    		if(currentInt<smallest)
				    {
				    	smallest = currentInt;
				    }  	
		    	}
		    	search = look.nextLine();
		    }
		    int convert = (int) Math.round(smallest);
		    //More descriptive input variables
		    Scanner originalDriversTxtFile = new Scanner(driversTxtFile);
		    String name = originalDriversTxtFile.nextLine();
		    String small = Integer.toString(convert);
		    if(convert==0) {
		    	small="";
		    }
		    while(originalDriversTxtFile.hasNextLine()) {
		    	if(name.contains(location) && name.contains(small)) {
		    		driver = name.substring(0, name.indexOf(','));
		    		break;
		    	}
		    	name = originalDriversTxtFile.nextLine(); 
		    }
		    
			look.close();
			originalDriversTxtFile.close();
			
		}
		catch (FileNotFoundException e) {
			//Original line: System.out.println("Error");
			//Line corrected so that the actual error prints out and the developer can fix it
			System.out.println(e);
		}

		try {
			//More descriptive input variables
			Formatter createdInvoice = new Formatter("../../Invoice.txt");
			if(!pizza.getRestLocation().equalsIgnoreCase(jill.getCustLocation())) {
				createdInvoice.format("Sorry! Our drivers are too far away from you to be able to deliver to your location.");
					
			}
			else{
				createdInvoice.format(jill.customerDetailsToString() + pizza.getRestName() + pizza.restaurantDetailsToString() + driver + jill.getAddress() + pizza.getRestContact());
			}

			createdInvoice.close();
		}
		catch (FileNotFoundException e) {
			//Original line: System.out.println("Error");
			//Line corrected so that the actual error prints out and the developer can fix it
			System.out.println(e);
		}
		
	}
}
