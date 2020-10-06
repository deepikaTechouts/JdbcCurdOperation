import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
	
public static void main(String[] args) throws ClassNotFoundException,SQLException {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("Driver class loaded");
			Connection con =null;
			con=DriverManager.getConnection("jdbc:oracle:thin:@localHost:1521:XE","System","Deepikasingh");
		    System.out.println("connection object is created");
			Statement st=con.createStatement();
		   
			st.executeUpdate("insert into Techouts values(103,'Rhea Singh','rhea@gmail.com')");
			System.out.println("Data is inserted successfully");
		
			con.close();
			}	
		
		
		
	

}
