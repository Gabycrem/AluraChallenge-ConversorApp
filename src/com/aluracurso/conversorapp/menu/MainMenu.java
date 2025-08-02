package com.aluracurso.conversorapp.menu;

import java.util.Scanner;

public class MainMenu {
    private Scanner teclado = new Scanner(System.in);
    public int showMainMenu(){
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("Sea bienvenido al Conversor de Moneda \n");
        System.out.println("OPCIONES: \n");
        System.out.println("1 - Dólar =>> Peso Agentino.");
        System.out.println("2 - Peso Agentino =>> Dólar.");
        System.out.println("3 - Dólar =>> Real Brasileño.");
        System.out.println("4 - Real Brasileño =>> Dólar.");
        System.out.println("5 - Dólar =>> Peso Colombiano.");
        System.out.println("6 - Peso Colombiano =>> Dólar.");
        System.out.println("7 - SALIR. \n");
        System.out.print("Seleccione una opción: ");
        return teclado.nextInt();
    }

    public String getBaseCode(int option){
        return switch (option){
            case 1, 3, 5 -> "USD";
            case 2 -> "ARS";
            case 4 -> "BRL";
            case 6 -> "COP";
            default -> "";
        };
    }

    public String getTargetCode(int option){
        return switch (option) {
            case 1 -> "ARS";
            case 2, 4, 6 -> "USD";
            case 3 -> "BRL";
            case 5 -> "COP";
            default -> "";
        };
    }
}
