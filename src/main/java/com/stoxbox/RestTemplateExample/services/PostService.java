package com.stoxbox.RestTemplateExample.services;

import org.codehaus.jettison.json.JSONArray;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PostService {
    private final RestTemplate restTemplate;

    public PostService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public JSONArray getPosts() {
        String apiUrl = "https://jsonplaceholder.typicode.com/posts";
        String response = restTemplate.getForObject(apiUrl, String.class);
        try {
            return new JSONArray(response);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
