package DataStructure;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes using the add, peek, remove & retrieve methods.
         * Use For-Each loop and While-loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */
        ArrayList<String> mohamed = new ArrayList();
        //adding data into the arraylist
        mohamed.add("Morocco");
        mohamed.add("Canada");
        mohamed.add("USA");
        mohamed.add("Italy");
        mohamed.add("Brazil");
        mohamed.remove(0);
        System.out.println("Get the element at index 2:" + " " + mohamed.get(2));
        System.out.println(" Remove the element at index 1: " + " " + mohamed.remove(1));
        System.out.println(" Set a value  at index 0: " + " " + mohamed.set(0, "UK"));
        //using for each loop
        System.out.println(" Use for each loop to print all the elements of an ArrayList");
        for (String s : mohamed) {
            System.out.println(s);
        }

        //using Iterator
        System.out.println("Use White loop With Iterator print all the elements of an ArrayList");
        Iterator iterator = mohamed.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        String url = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
        String user = "root";
        String password = "abcd123";
        Statement statement=null;
        Connection connection=null;

//        try {
//            connection = DriverManager.getConnection(url, user, password);
//            statement = connection.createStatement();
//
//            String query = "insert into arraylist (id,name) values (2,'france');";
//            statement.execute(query);
//
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//            System.out.println(" something went wrong with connection");
//        }
//
//    }

    }}