
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_Connect {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "Sachin@.123");
// 1521 is our port NUmber  jdbc- API Oracle-Database thin-Driver Class xe-Oracle Service
Statement smt=con.createStatement();
smt.executeUpdate("create table emp(eno number, ename varchar(30), esal number )");
System.out.println("Table Created Succesfully..");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
