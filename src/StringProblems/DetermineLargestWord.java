package StringProblems;
import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {

        public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below
         Should return "10 biological"
         */
            String s = "Human brain is a biological learning machine";
            Map<Integer, String> wordNLength = findTheLargestWord(s);
            int longLength = 0;
            for (Integer length : wordNLength.keySet())
                if (length > longLength)
                    longLength = length;
            System.out.println(longLength + " " + wordNLength.get(longLength));



        }

        public static Map<Integer, String> findTheLargestWord(String string) {
            Map<Integer, String> map = new HashMap<Integer, String>();
            String st = "";

            // Implement here
            for (String word : string.split(" "))
                map.put(word.length(), word);
            return map;


        }
    }

