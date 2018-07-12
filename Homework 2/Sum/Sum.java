public class Sum {

	public static void main(String [] args){
		
		int firstNumber, secondNumber, total;   // Declares the all variables
		
		System.out.println("Enter number:");
		firstNumber = IO.readInt();             // User inputs a value for firstNumber
		
		System.out.println("Enter number:");
		secondNumber = IO.readInt();            // User inputs a value for secondNumber
		
		total = firstNumber+secondNumber;       // adds up the values for firstNumber and secondNumber to get the total
		
		IO.outputIntAnswer(total);  // Prints out the total
		
	}
}
