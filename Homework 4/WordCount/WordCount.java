public class WordCount {

    public static void main(String args[]) {
        System.out.println("Input a string");
        String s;
        s = IO.readString();
        System.out.println("Pick a min length");
        int x = IO.readInt();

        int numberOfWords = countWords(s, x);
        System.out.println(numberOfWords);

    }


    public static int countWords(String original, int minLength) {

        int count = 0;
        int j = 0;

        original = original.replaceAll("[^a-zA-Z0-9\\s]", "").trim().replaceAll("\\s{2,}", " ").replaceAll("[0-9]", "").toLowerCase(); //Takes out all non letter characters and deletes multiple spaces

        //System.out.println(original);  // debug
        // System.out.println(original.length()); // debug

        for (int i = 0; i <= original.length() - 1; i++) {


            if (original.charAt(i) == ' ' && original.substring(j, i).length() >= minLength && j==0) {
                count++;
                j=i;
            }
            else if (original.charAt(i) == ' ' && original.substring(j+1, i).length() >= minLength && j!=0) {
                count++;
                j=i;
            }
            else if (original.charAt(i) == ' ' && original.substring(j+1, i).length() < (minLength)) {
                j=i;
            }

            else if (!original.substring(i).contains(" ") && original.substring(i).length()>=(minLength)){
                count++;
                break;
            }

            else if(!original.substring(i).contains(" ")){
                break;
            }
        }
        return count;
    }
}