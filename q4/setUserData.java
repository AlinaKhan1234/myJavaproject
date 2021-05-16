public static void setPersonData(String name, String birthYear, String about) throws IOException{
		HttpURLConnection connection = (HttpURLConnection) new URL("http://localhost:8080/users/" + name).openConnection();

		connection.setRequestMethod("POST");
		
		String postData = "name=" + URLEncoder.encode(name);
		postData += "&color=" + URLEncoder.encode(color);
		postData += "&yob=" + yob;
		
		connection.setDoOutput(true);
	    OutputStreamWriter wr = new OutputStreamWriter(connection.getOutputStream());
	    wr.write(postData);
	    wr.flush();
		
		int responseCode = connection.getResponseCode();
		if(responseCode == 200){
			System.out.println("POST was successful.");
		}
		else if(responseCode == 401){
			System.out.println("Wrong password.");
		}
	}
}