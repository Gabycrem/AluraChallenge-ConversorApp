package com.aluracurso.conversorapp.menu;

import java.util.Scanner;

public class MainMenu {
    private Scanner teclado = new Scanner(System.in);
    public int showMainMenu(){
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("Sea bienvenido al Conversor de Moneda \n");
        System.out.println("OPCIONES: \n");
        System.out.println("1 - Dolar =>> Peso Agentino.");
        System.out.println("2 - Peso Agentino =>> Dolar.");
        System.out.println("3 - Dolar =>> Real Brasileño.");
        System.out.println("4 - Real Brasileño =>> Dolar.");
        System.out.println("5 - Dolar =>> Peso Colombiano.");
        System.out.println("6 - Peso Colombiano =>> Dolar.");
        System.out.println("7 - SALIR. \n");
        System.out.print("Su opción: ");
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
