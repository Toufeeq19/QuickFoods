package QuickFoods.java;

public class customer {
	   // Attributes
		int orderNum;
		String custName; 
		String custContact;
		String custAddress;
		String custLocation;
		String custEmail;
		
		// Methods
		public customer(int orderNum, String custName, String custContact, String custAddress, String custLocation, String custEmail) {
		     this.orderNum = orderNum;
		     this.custName = custName;
		     this.custContact = custContact;
		     this.custAddress = custAddress;
		     this.custLocation = custLocation;
		     this.custEmail = custEmail;
		}
		public String customerDetailsToString() {
			String output = "Order number: " + orderNum;
			output += "\nCustomer: " + custName;
			output += "\nEmail: " + custEmail;
			output += "\nPhone number: " + custContact;
			output += "\nLocation: " + custLocation +"\n";
			return output;
		}
		
		public String getCustLocation() {		
			String output = custLocation;
			return output;  
	    }
		
		public String getAddress() {	
			String addy = custAddress;
			String separate = addy.substring(0, addy.indexOf('d')+1);
			String separate2 = addy.substring(addy.indexOf('d')+2, addy.length());
			String output = " is nearest to the restaurant and so he will be delivering your order to you at: \n\n" + separate + "\n" + separate2;
			return output;  
	    } 

}


