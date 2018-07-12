public class SmallestLargest {
	
	public static void main (String [] args){
		
		double value = 0;
		double large = 0;
		
		System.out.println("Pick a terminating value");
		double termValue = IO.readDouble();
		double small = IO.readDouble();
		
		large=small;
		value=small;
		
		while(small == termValue){   // while the number is equal to the terminating value, will loop till it isn't equal
			IO.reportBadInput();
			small=IO.readDouble();
		}
		
		while(value != termValue){  
			
			value=IO.readDouble();
			
			if(value==termValue){    // ends the program when the terminating value is inputed
				break;
			}
			
			if(value>large){        // sets the greater value equal to large
				large = value;
			}
			
			else if(value<small){   // sets the smallest value to small
				small= value;
			}
			
			
		}
		
		IO.outputDoubleAnswer(small);
		IO.outputDoubleAnswer(large);
	}

}
