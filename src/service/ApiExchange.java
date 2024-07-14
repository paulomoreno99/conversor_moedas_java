package service;

import model.Converter;
import com.google.gson.Gson;
import model.Converter;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiExchange {
    public static Converter currencyConverter(String base_code, String target_code) {
        String key = "437220a0db876f4bd71cd378";
        String url = "https://v6.exchangerate-api.com/v6/" + key + "/pair/" + base_code + "/" + target_code;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        try {

            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), Converter.class);

        } catch (IOException | InterruptedException error) {

            throw new RuntimeException("Moeda incorreta!");

        }
    }
}
