public class LuckySevens {
	public static void main(String [] args){
		
		  int low = IO.readInt();        // this sets min in range
	        int high = IO.readInt();         // this sets max in range
	        if (high < low) {
	            IO.reportBadInput();
	        }
	        int total = high - low;            
	        int numberOfSevens = 0;            
	        char[] str = new char[total];       
	        
	        for(int i = low; i <= high; i++) {        
	            String numberAsString = Integer.toString(i);      
	            numberAsString.getChars(0, numberAsString.length(), str, 0);       
	            for (int j = 0; j < str.length; j++){        
	                if (str[j] == '7'){
	                   
	                    numberOfSevens += 1;
	                }
	            }
	        }
	        IO.outputIntAnswer(numberOfSevens);
	    }
	}
	