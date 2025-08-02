package com.aluracurso.conversorapp.service;

import com.aluracurso.conversorapp.model.Currency;

public class ConvertCurrencyService {
    static ExchangeRateService exchangeRateService = new ExchangeRateService();
    public static Double convertCurrency(String baseCode, String targetCode, Double valueConvert){

        Currency currency = exchangeRateService.searchCurrency(baseCode);
        Double rate = currency.conversion_rates().get(targetCode);
        if (rate == null){
            System.out.println("No se encontró la moneda destino: " + targetCode);
        }
        return valueConvert * rate;
    }
}
