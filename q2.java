import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args){
		try {
			System.out.println("Connecting to database.");
			String connectionUrl = "jdbc:derby:C:/Users/Alina/Desktop/DerbyDatabase";
			Connection connection = DriverManager.getConnection(connectionUrl);
			
			Statement insertRowStatement = connection.createStatement();
			
			insertRowStatement.executeUpdate("insert into Users (name, yob, color) values('Alina', 2001, 'Green')");
			System.out.println("Added Ada to the People table.");
			
			insertRowStatement.executeUpdate("insert into Users (name, yob, color) values('Lina', 2000, 'Red')");
			System.out.println("Added Grace to the People table.");
			
			insertRowStatement.executeUpdate("insert into Users (name, yob, color) values('Mrs. Khan', 2007, 'Pink')");
			System.out.println("Added Stanley to the People table.");
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("Question 2 completed...");
	}
}