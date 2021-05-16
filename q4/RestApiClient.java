import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;
import org.json.JSONObject;

public class RestApiClient {

	public static void main(String[] args) throws IOException{
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to Test Breakdown: ");
		System.out.println("Do you want to Insert or Retrieve a User's info?");
		System.out.println("(Type 'Insert' or 'Retrieve' now.)");
		String getOrSet = scanner.nextLine();
		if("Retrieve".equalsIgnoreCase(getOrSet)){
			System.out.println("Whose info do you want to get?");
			System.out.println("(Type a User's name now.)");
			String name = scanner.nextLine();
			String jsonString = getPersonData(name);
			JSONObject jsonObject = new JSONObject(jsonString);
			String color = jsonObject.getInt("color");
			int yob = jsonObject.getInt("yob");
			System.out.println(name + " was born in " + yob + ". Their favorite color is " + color + ".");
		}
		else if("Insert".equalsIgnoreCase(getOrSet)){
			System.out.println("Whose info do you want to Insert?");
			System.out.println("(Type a person's name now.)");
			String name = scanner.nextLine();
			
			System.out.println("When was " + name + " born?");
			System.out.println("(Type a year now.)");
			String yob = scanner.nextLine();
			System.out.println("What is " + name + " fav color?");
			System.out.println("(Type a color now.)");
			String color = scanner.nextLine();
			
			
			setUserData(name, yob,color);
		}
		
		scanner.close();
		
		System.out.println("Thanks for using.");
		
	}
}