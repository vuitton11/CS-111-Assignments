public class Party {

	public static void main (String [] args){
		
		System.out.println("The number of people attending the party");
		int amountOfPeople = IO.readInt();  // Declares numberOfPeople and lets the user input a value 
		
		System.out.println("The number of slices of pizza each person should be able to eat");
		int slicesPerPerson = IO.readInt(); // Declares slicesPerPerson and lets the user input a value 
		
		System.out.println("The number of cans of soda each person should be able to drink");
		int cansPerPerson = IO.readInt(); // Declares cansPerPerson and lets the user input a value 
		
		System.out.println("The cost of a pizza pie");
		double piePrice = IO.readDouble(); // Declares piePrice and lets the user input a value 
		
		System.out.println("The number of slices in a pizza pie");
		int slicesPerPie = IO.readInt(); // Declares slicesPerPrice and lets the user input a value 
		
		System.out.println("The cost of a case of soda");
		double priceOfACase = IO.readDouble(); // Declares priceOfACase and lets the user input a value 
		
		System.out.println("The number of cans in a case of soda");
		int cansInACase = IO.readInt(); // Declares cansInACase and lets the user input a value 
		
		int pieAmount = ((amountOfPeople * slicesPerPerson) / slicesPerPie); // Calculates the number of pies needed
	
		int sodaAmount = (( amountOfPeople * cansPerPerson) / cansInACase); // Calculates the number of cases of soda needed
		
		if ((amountOfPeople * slicesPerPerson) % slicesPerPie >0){          
			pieAmount += 1;                                                 // if the answer has a remainder that isnt zero, it add one more pie 
		}
		
		if (( amountOfPeople * cansPerPerson) % cansInACase > 0){ 
			sodaAmount += 1;                                                // if the answer has a remainder, it adds 1 to sodaAmount
		}
		
		double totalCost = (piePrice * pieAmount) + (priceOfACase * sodaAmount);   // Calculates the total cost
		
		double finalCost = (double) Math.round(totalCost* 100)/100;     // Rounds the answer to 2 decimals places
		
		IO.outputDoubleAnswer(finalCost);  // Prints the Final Cost
	
	}
}
