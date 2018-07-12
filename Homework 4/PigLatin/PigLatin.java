public class PigLatin {

        public static void main(String[] args) {

            String x;
            x = IO.readString();
            String pigLatin = translate(x);
            System.out.println(pigLatin);
        }


        public static String translate(String original) {

            original = original.toLowerCase();
            String vowel = "way";
            String consonant = "ay";
            String test = "";
            String firstChar= "";



            if ((original.charAt(0) == 'a') ||
                    (original.charAt(0) == 'e') ||
                    (original.charAt(0) == 'i') ||
                    (original.charAt(0) == 'o') ||
                    (original.charAt(0) == 'u')) {

                test = original + vowel;

                return test;
            } else {

                for(int i = 0; i<= original.length()-1;i++){

                    if ((original.charAt(i) == 'a') ||
                            (original.charAt(i) == 'e') ||
                            (original.charAt(i) == 'i') ||
                            (original.charAt(i) == 'o') ||
                            (original.charAt(i) == 'u')) {

                        firstChar = original.substring(0,i);

                        original = original.substring(i);

                        test = original + firstChar + consonant;

                        break;

                    }
                    }
                return test;

            }

        }
    }