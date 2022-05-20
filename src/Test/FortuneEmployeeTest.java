/*package Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class studentdata {

    public static void main(String[] args) {
    dbconnection();
    studentdata();

    }

        public static void studentdata () {

            String csvFilePath = "c:\\Users\sron4\Downloads\myfile1.csv";
            try {
                BufferedReader lineReader = new BufferedReader(new FileReader(csvFilePath));
                CSVParser records = CSVParser.parse(lineReader, CSVFormat.EXCEL.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());

                ArrayList<Student> students = new ArrayList<Student>();
                for (CSVRecord record : records) {
                    Student student = new Student();
                    student.setStudentId(Integer.parseInt(record.get(0)));
                    student.setStudentName(record.get(1));
                    students.add(student);
                }
                PreparedStatement statement = null;
                Connection con = dbconnection();
                String sql = "INSERT INTO student(STUDENTID, STUDENTNAME) VALUES (?, ?)";
                statement = con.prepareStatement(sql);
                for (Student record : students) {
                    statement.setInt(1, record.getStudentId());
                    statement.setString(2, record.getStudentName());

                    statement.addBatch();
                }
                statement.executeBatch();
                con.commit();
                con.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }


        public static Connection dbconnection () {

            Connection connection = null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdata?", "root", "abcd123");
                System.out.println("connection sucessfull");
                connection.setAutoCommit(false);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return connection;
        }
    }
*/