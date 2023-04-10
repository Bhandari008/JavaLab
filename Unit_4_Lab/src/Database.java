import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	Connection con;

	public Database() throws ClassNotFoundException, SQLException {
		
		System.out.println("Starting");
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String database = "NSC_CSIT_Assignment";
		int port = 1433;
		String server = "//DESKTOP-6C86VFI";
		String connectionString = "jdbc:sqlserver:"+server+":"+port+";databaseName="+ database+";integratedSecurity=true;"+
			     "encrypt=true;trustServerCertificate=true";
		
		
		con = DriverManager.getConnection(connectionString);
		
		System.out.println("Connection Activated");	
		
	}
	
	Connection getConnection() {
		return con;
	}
	// Test purpose
//	public static void main(String[] args) throws ClassNotFoundException, SQLException
//	{
//		new Database();
//	}
}