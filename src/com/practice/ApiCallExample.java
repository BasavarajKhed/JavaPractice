package com.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiCallExample {

    public static void main(String[] args) {
        try {
            // URL of the API endpoint
            String apiUrl = "https://api.example.com/data";
            
            // Create a URL object
            URL url = new URL(apiUrl);
            
            // Open a connection
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            
            // Set the request method (GET, POST, etc.)
            connection.setRequestMethod("GET");
            
            // Set headers if necessary
            connection.setRequestProperty("Accept", "application/json");
            // connection.setRequestProperty("Authorization", "Bearer YOUR_ACCESS_TOKEN"); // For authenticated API calls
            
            // Get the response code
            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);
            
            // If the response code is 200 (HTTP_OK), read the response
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();
                
                // Read the input stream and append to StringBuilder
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                
                // Print the response content
                System.out.println("Response: " + response.toString());
            } else {
                System.out.println("GET request failed.");
            }
            
            // Disconnect the connection
            connection.disconnect();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

