import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstProgram {
	
public static void main(String[] args) throws ClassNotFoundException,SQLException {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("Driver class loaded");
			Connection con =null;
			con=DriverManager.getConnection("jdbc:oracle:thin:@localHost:1521:XE","System","Deepikasingh");
		    System.out.println("connection object is created");
			Statement st=con.createStatement();
		   // st.executeUpdate("create table Techouts(Eid number(5), Empname varchar(20),Email varchar(40))");
			//System.out.println("table has created now");
			
			/*st.executeUpdate("insert into Techouts values(103,'Rhea Singh','rhea@gmail.com')");
			System.out.println("Data is inserted successfully");*/
		
			/*st.executeUpdate("DELETE FROM Techouts WHERE Eid = 111");
			System.out.println("Recored is deleted successfully");*/
			
			
			st.executeUpdate("Update Techouts set Empname='Sumaiyya' WHERE Eid = 102");
			System.out.println("Recored is updated successfully");
			
			
			con.close();
			}	
		
		
		
	

}
