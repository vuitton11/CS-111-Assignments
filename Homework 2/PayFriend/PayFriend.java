public class PayFriend {
	
	public static void main (String [] args){
		
		double fee= 0;   // Declares fee variable 
		
		System.out.println("What is the amount you would like to pay a friend?");
		
		double amount = IO.readDouble();
		
		if (amount<0){                            
			
			System.out.println("Error");
		}
		
		if( amount > 0 && amount < 100){
			
			fee=5;
	}
		
		 if (amount<1000 && amount>100){
			if((amount *.03) < 6){
				
				fee =  6;
		}
			else{
				fee = (amount*.03);
				
			}
		}
		 
		 if( amount>1000 && amount< 10000){
			 
			 if((amount*.01) < 15){
				 fee = 15;
			 }
			 else{
				 fee = (amount*.01);
			 }
		 }
		
		 if(amount>10000){
			 fee = (10000*.01);
			 
		 }
		 if(amount>10000 & amount<=15000){
			 fee+= ((amount-10000)*.02);
			 
		 }
		 if(amount>15000){
			 fee+= ((amount-15000)*.03);
		fee+=((5000)*.02);
			 
		 }
		
	 IO.outputDoubleAnswer(fee);
		
	}
}


