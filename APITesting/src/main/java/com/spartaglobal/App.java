package com.spartaglobal;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class App {
    public static void main(String[] args) {
//        HttpClient client = HttpClient.newHttpClient();
//        HttpRequest request = HttpRequest
//                .newBuilder()
//                .uri(URI.create("src/main/resources/rates.json"))
//                .build();
//
//        try {
//            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
//            System.out.println(response.body());
//        } catch (IOException | InterruptedException e) {
//            e.printStackTrace();
//        }

//        ObjectMapper mapper = new ObjectMapper();
//        try {
//            AgeResponse responseJamal = mapper.readValue(new URL("https://api.agify.io?name=Jamal"), AgeResponse.class);
//            AgeResponse responseMathew = mapper.readValue(new URL("https://api.agify.io?name=Mathew"), AgeResponse.class);
//            AgeResponse responseGowri = mapper.readValue(new URL("https://api.agify.io?name=Gowri"), AgeResponse.class);
//            System.out.println(responseJamal.getName());
//            System.out.println(responseGowri.getName());
//            System.out.println(responseMathew.getName());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        ObjectMapper mapper2 = new ObjectMapper();
        try {
            RatesResponse response2 = mapper2.readValue(new File("src/main/resources/rates.json"), RatesResponse.class);
            System.out.println(response2.getRates());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

