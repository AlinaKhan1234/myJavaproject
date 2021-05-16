import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args){
		try {
			System.out.println("Connecting to database.");
			String connectionUrl = "jdbc:derby:C:/Users/Alina/Desktop/DerbyDatabase";
			Connection connection = DriverManager.getConnection(connectionUrl);
			
			Statement getRowStatement = connection.createStatement();
			ResultSet resultSet = getRowStatement.executeQuery("select * from Users");
			while(resultSet.next()){
				String name = resultSet.getString("name");
				int yob = resultSet.getInt("yob");
				String color = resultSet.getString("color");
				System.out.println(name + " was born in " + yob + ". Their favorite color is " + color + ".");
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("Question 3 completed...");
	}
}