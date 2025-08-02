package com.aluracurso.conversorapp.service;

import com.aluracurso.conversorapp.model.Currency;
import com.aluracurso.conversorapp.util.ApiKeyReader;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeRateService {

    String apiKey = ApiKeyReader.getApiKey();
    public Currency searchCurrency(String currencyExchange){
        URI apiUrl = URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + currencyExchange);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(apiUrl)
                .build();
        try{
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Currency.class);
        }catch (IOException |InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
