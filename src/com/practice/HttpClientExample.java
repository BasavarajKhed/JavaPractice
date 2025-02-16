package com.practice;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpHeaders;
import java.util.Map;

public class HttpClientExample {

    public static void main(String[] args) {
        try {
            // Create an HttpClient instance
            HttpClient client = HttpClient.newHttpClient();
            
            // Create an HttpRequest for a GET request
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("https://jsonplaceholder.typicode.com/posts"))
                    .build();

            // Send the request and get the response
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Print the response status and body
            System.out.println("Response Status: " + response.statusCode());
            System.out.println("Response Body: " + response.body());
            
            // Print the response headers
            HttpHeaders headers = response.headers();
            
            Map<String, java.util.List<String>> allHeaders = headers.map();
            
            System.out.println("Response Headers: " + allHeaders);
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

