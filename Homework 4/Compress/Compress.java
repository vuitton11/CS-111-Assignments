public class Compress {

    public static void main(String[] args) {
        System.out.println("input a string");
        String original = IO.readString();
        IO.outputStringAnswer(compress(original));
    }

    public static String compress(String original) {
        String compressed = "";
        int count = 1;
        char letter = 0;


        for (int i = 0; i < original.length(); i++) {

            if (letter == original.charAt(i)) {
                count = count + 1;
            } else {
                if (count != 1) {
                    compressed = compressed + count;
                    compressed = compressed + letter;
                } else {
                    compressed = compressed + letter;
                }
                letter = original.charAt(i);
                count = 1;
            }
        }
            if (count != 1) {
                compressed = compressed + count;
                compressed = compressed + letter;
            } else {
                compressed = compressed + letter;
            }
            return compressed.trim();
        }
    }
