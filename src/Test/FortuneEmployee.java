package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class FortuneEmployee {

    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "abcd123");

        Statement stmt=con.createStatement();

        /*ALTER TABLE `student`.`student`
        ADD COLUMN `StudentName` VARCHAR(45) NULL AFTER `StudentID`,
        CHANGE COLUMN `Student` `StudentID` INT NOT NULL ; */


        String s ="INSERT INTO `student`.`student` (`StudentID`, `StudentName`) VALUES ('1', 'khikhi');";


        stmt.execute(s);

        con.close();

        System.out.print("Query executed");

    }



        }