package DataStructure;
import java.util.HashMap;
public class CollectionView {

    public static void main(String[] args) {
        /*
         Map is created and some data is inserted into it.
         Retrieve the Collection view of the values present in map
         */

            HashMap<Integer, String> map = new HashMap<Integer, String>();
            map.put(1, "NYC");
            map.put(2, "LA");
            map.put(3, "Denver");
            map.put(4, "Boston");
            map.put(5, "San Jose");
            map.put(6, "Seattle");
            map.forEach((k, v) -> System.out.println("Key = "
                    + k + ", Value = " + v));
        }

    }


