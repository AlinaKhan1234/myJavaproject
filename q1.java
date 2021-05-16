import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args){
		try {
			System.out.println("Database connecting...");
			String connectionUrl = "jdbc:derby:C:/Users/Alina/Desktop/DerbyDatabase;create=true";
			Connection connection = DriverManager.getConnection(connectionUrl);
			
			Statement createPeopleTableStatement = connection.createStatement();
			createPeopleTableStatement.executeUpdate("create table Users(name varchar(16), yob integer, color varchar(16), primary key(name))");
			System.out.println("Users table created.");
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("Question 1 completed..");
	}
}