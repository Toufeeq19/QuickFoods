package QuickFoods.java;

public class restaurant {
	    // Attributes
		String restName;
		String restLocation;
		String restContact;
		String meal;
		int mealQuantity;
		int mealPrice;
		String prepInstructions;
		int totalCost;
		
		// Methods
		public restaurant(String restName, String restLocation, String restContact, String meal, int mealQuantity, int mealPrice, String prepInstructions, int totalCost) {
		     this.restName = restName;
		     this.restLocation = restLocation;
		     this.restContact = restContact;
		     this.meal = meal;
		     this.mealQuantity = mealQuantity;
		     this.mealPrice = mealPrice;
		     this.prepInstructions = prepInstructions;
		     this.totalCost = totalCost;
		     
		}
		
		public String getRestName() {
			String output = "\nYou have ordered the following from " + restName + " in " + restLocation + ": \n";
			return output;
		}
		
		public String restaurantDetailsToString() {
			String output = "\n" + mealQuantity + " x " + meal + "(R" + mealPrice + ".00)";
			output += "\n\nSpecial Instructions: " + prepInstructions;
			output += "\n\nTotal: " + "(R" + totalCost + ".00)\n\n";
			return output;
		}
		
		public String getRestLocation() {
			return restLocation;
		}
		
		public String getRestContact() {
			String output = "\n\nIf you need to contact the restaurant, their number is " + restContact + ".";
			return output;
		} 
				
		
}
