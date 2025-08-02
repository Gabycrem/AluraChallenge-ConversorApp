package com.aluracurso.conversorapp.app;

import com.aluracurso.conversorapp.menu.MainMenu;
import com.aluracurso.conversorapp.model.Currency;
import com.aluracurso.conversorapp.service.ConvertCurrencyService;
import com.aluracurso.conversorapp.service.ExchangeRateService;
import com.aluracurso.conversorapp.util.MyValidator;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        MainMenu menu = new MainMenu();
        int option;
        do {
            do{
                option = menu.showMainMenu();
                if(!MyValidator.validOption(option)){
                    System.out.println("Opción inválida.");
                }
            } while (!MyValidator.validOption(option));
            System.out.println("Eligió la opción " + option);
            if (option != 7) {
                String baseCode = menu.getBaseCode(option);
                String targetCode = menu.getTargetCode(option);
                System.out.print("Ingrese el monto a convertir: ");
                double valueConvert = Double.valueOf(teclado.nextLine());
                var convert = ConvertCurrencyService.convertCurrency(baseCode, targetCode, valueConvert);
                System.out.println(valueConvert + " " + baseCode + " equivalen a " + convert + " " + targetCode);
                waitForUserInput();
            } else {
                System.out.println(" - - - - - - - - - - - - - - - - - - - - - -");
                System.out.println("Aplicación finalizada. \n Gracias, vuelva pronto.");
            }
        } while (option != 7);
    }

    public static void waitForUserInput() {
        System.out.println("\nPresione ENTER para continuar...");
        new java.util.Scanner(System.in).nextLine();
    }
}
