public class LuckyNines{
    public static void main(String[] arguments){
        
        int lowerEnd = IO.readInt();        // Establish min in range
        int upperEnd = IO.readInt();        //Establish max in range
        
        countLuckyNines(lowerEnd, upperEnd);
    }
    
    public static int countLuckyNines(int lowerEnd, int upperEnd){
        
        if (upperEnd < lowerEnd) {
            IO.reportBadInput();
            //System.out.println("TEST");
            return -1;
        } else {
            int total = upperEnd - lowerEnd;                   
            int numberOfNines = 0;                                
            char[] str = new char[total];                        
            System.out.println("TEST1");
            for(int i = lowerEnd; i <= upperEnd; i++) {            // Loop through the range of numbers
                String numberAsString = Integer.toString(i);        // Convert each number to a string
                numberAsString.getChars(0, numberAsString.length(), str, 0);        // Pass each letter (number in each decimal place) to an array for testing
                for (int j = 0; j < str.length; j++){            // array loop to test each number for 9 or not
                    if (str[j] == '9'){
                        numberOfNines += 1;
                    }
                }
            }

            IO.outputIntAnswer(numberOfNines);
            return numberOfNines;
        }
            
    }
}