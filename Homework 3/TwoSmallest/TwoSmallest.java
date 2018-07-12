public class TwoSmallest {

	public static void main(String [] args){
		
		double smallest = 0;
		double small = 0;
		double large = 0;
		
		System.out.println("Pick a terminating value");
		int termValue = IO.readInt();
		double value = IO.readDouble();

		while(value == termValue){
			IO.reportBadInput();
			value = IO.readDouble();

		}
		
		small = value;
		smallest = value;
		
		while(value != termValue){
			
			if(value == termValue){
				break;
			}
			
			else if(value<smallest){
				small = smallest;
				smallest = value;
			}
			
			else if(value == smallest){
				small = value;
			}
			
			else if(value > smallest && value < small){
				small = value;
			}
			
			else if(value > smallest && value > small){
				large = value;
			}
			
			else if(value < smallest && value > small){
				smallest = small;
				small = value;
			}
			
			if (smallest == small){
				small = value;
			}
			value =IO.readDouble();
		}
	
	
		IO.outputDoubleAnswer(smallest);
		IO.outputDoubleAnswer(small);
	}
}
