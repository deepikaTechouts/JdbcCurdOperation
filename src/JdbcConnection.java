import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnection {

	public static void main(String[] args) {
			Connection con=null;
	try
	{
		Class.forName("oracle.jdbc.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localHost:1521:XE","System","Deepikasingh");
	    Statement st=con.createStatement();
	    
	
	}
	catch(ClassNotFoundException|SQLException e)
	{
		e.printStackTrace();
		}
	finally
	{
		try {
			con.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			}

	}
		}
		
		
		
		
	}


