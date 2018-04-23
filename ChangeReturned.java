package javaClassProjects;

import java.util.Scanner;

public class ChangeReturned {

	public static void main(String[] args) {
		
		// Ask the user the amount of change they are expecting - integers between 1 and 99

				
		System.out.println("What is the denomination of change you expect? Input number from 1 - 99...");
		
		Scanner input= new Scanner(System.in);
		
		int totalchange = input.nextInt();
		
		// Call the returnChange function
		returnChange(totalchange);
		
		
	}
	// returnChange Function which computes and prints out denominations of Quarters, Dimes, Nickels and Pennies
    
	private static void returnChange(int change) {
        //totalChange is equal to the amount of change the user input when asked in main
		
    	int totalChange = change;
    	int remainingChange;
    	System.out.println("Total Change you expect: " + totalChange + " cents");
    	
    	//Check if there if the change amt is large enough to include quarters
    	
    	if (totalChange >= 25) {
    		int numberofQtrs = (int)(totalChange)/25;
    		System.out.println("Number of Quarters: " + numberofQtrs);
    		remainingChange = totalChange - (numberofQtrs * 25);
    		//System.out.println("Remaining change: " + remainingChange);
    		totalChange = remainingChange;
    	
    	}
    		//Check if there is leftover change and whether it is enough to include dimes
        		
        	if (totalChange >= 10) {
        	    int numberofdimes = (int)(totalChange)/10;
            	System.out.println("Number of Dimes: " + numberofdimes);
           		remainingChange = totalChange - (numberofdimes * 10);
           		//System.out.println("Remaining change: " + remainingChange);
           		totalChange = remainingChange;
       		}
        	
        	//Check if there is leftover change and whether it is enough to include nickels
            	
         	if (totalChange >= 5) {
        	    int numberofnickels = (int)(totalChange)/5;
                System.out.println("Number of Nickels: " + numberofnickels);
                remainingChange = totalChange - (numberofnickels * 5);
             	//System.out.println("Remaining change: " + remainingChange);
                totalChange = remainingChange;
             }
            		 
            //Lastly, Check if there is leftover change. This would be your pennies.
        		
         	if (totalChange>0) {
        		int numberofpennies = (int)(totalChange)/1;
            	System.out.println("Number of Pennies: " + numberofpennies);
            			
            }
         		
    	
    	    
    
	}

}
