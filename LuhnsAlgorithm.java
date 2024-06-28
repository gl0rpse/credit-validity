import java.util.Scanner;

//main class
public class LuhnsAlgorithm {
	//method for the Luhn Algorithm
	//returns True or False based on the validity of the credit card entered
	public static boolean luhnAlgo(long cardNum) {
		
	    //convert card digits to String value
	    String cardDigits = Long.toString(cardNum);
	    
	    //get the length of the card number
	    int length = cardDigits.length();
	    
	    //create an array of integers with length of card digits
	    int[] numberArray = new int[length];
	    
	    //fill the array with the digits of the card number
	    for (int i = 0; i < length; i++) {
	        numberArray[i] = Character.getNumericValue(cardDigits.charAt(i));
	    }
	    
	    //iterate every other digit starting from the right (second-to-last digit)
	    for (int i = length - 2; i >= 0; i -= 2) {
	        int doubled = numberArray[i] * 2;
	        // If doubling the number results in a number greater than 9, subtract 9
	        if (doubled > 9) {
	            doubled -= 9;
	        }
	        numberArray[i] = doubled;
	    }
	    
	    //sum all the digits
	    int sum = 0;
	    for (int i = 0; i < length; i++) {
	        sum += numberArray[i];
	    }
	    
	    //if the sum is divisible by 10, return true. otherwise, return false
	    return (sum % 10 == 0);
	    
	}//end luhnAlgo

	//method to decide the vendor of the card
	public static String cardVendor(long cardNum) {
		String vendor = "";
		
		//convert long to String value
		String digits = Long.toString(cardNum);
		
		//if-else statements to determine vendor
		if (digits.charAt(0) == '3') {
			vendor = "American Express";
		}
		else if (digits.charAt(0) == '4') {
			vendor = "Visa";
		}
		else if (digits.charAt(0) == '5') {
			vendor = "Mastercard";
		}
		else {
			vendor = "Discover";
		}
		
		//return statement
		return vendor;
		
	} //end cardVendor
	
	
	//main method
	public static void main(String[] args) {
	
		//string variable for card type
        String cardType = "";

        //scanner for user input
        Scanner in = new Scanner(System.in);

        //user prompt for credit card number
        System.out.println("Please enter your credit card credentials: ");
        
        //while loop to make sure there is a number value
        while (!in.hasNextLong()) {
            System.out.println("Invalid input. Please re-enter and try again!");
            in.next(); // consume the invalid input
            System.out.println("Please enter your credit card credentials: ");
        }
        
        //read the valid long input
        long cardNum = in.nextLong();
        
        boolean validity = luhnAlgo(cardNum);
        cardType = cardVendor(cardNum);
        
        //print statements
        if (validity) {
        	System.out.println();
        	System.out.println("Type of card: " + cardType + "\nThis is a valid card.");
        }
        else {
        	System.out.println();
        	System.out.println("This is not a valid card.");
        }
         
        //close scanner
        in.close();

	}//end main

}//end CreditCardVerification
