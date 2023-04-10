import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;


public class PreparedStatement {
	Connection con;
	java.sql.PreparedStatement statement;
	ResultSet resultset;
	
	public PreparedStatement() throws ClassNotFoundException, SQLException {
		con = new Database().getConnection();
		
		// Update Query
		String update = "UPDATE STUDENT SET Firstname=? WHERE Lastname=?";
		statement = con.prepareStatement(update);
		
		statement.setString(1, "Bob");
		statement.setString(2, "Cruz");
		statement.executeUpdate();
		
		System.out.println("Updated data");
		
		// Delete query
		String delete = "DELETE FROM STUDENT WHERE Lastname = (?)";
		
		statement = con.prepareStatement(delete);
		statement.setString(1, "Kat");
		statement.executeUpdate();
		
		System.out.println("Deleted  row");
		

	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		new PreparedStatement();
	}
	
}
