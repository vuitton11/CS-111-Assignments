public class StringRec {


    public static void main(String[] arguments){
        System.out.print("DEBUG: ");
        String input = IO.readString();
        System.out.print(decompress(input));
    }


    public static String decompress(String compressedText){

        char x = ' ';


        if(compressedText == "") {return compressedText;}
        if(compressedText.length() != 1) {x = compressedText.charAt(1);}
        if(compressedText.length() == 1) {return compressedText;}

        else if(compressedText.charAt(0) == '0' && compressedText.length() != 2)  {
            return decompress(compressedText.substring(2));
        }
        else if(compressedText.charAt(0) == '0' && compressedText.length() == 2){
            compressedText = "";
            return compressedText;
        }
        else if(Character.isDigit(compressedText.charAt(0)) == true){
            int z = Integer.parseInt(compressedText.substring(0,1));
            z = z - 1;
            String p = Integer.toString(z);
            return x + decompress(p.concat(compressedText.substring(1)));
        }

        return compressedText.charAt(0)+decompress(compressedText.substring(1));

    }


}