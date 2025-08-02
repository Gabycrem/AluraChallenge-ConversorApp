package com.aluracurso.conversorapp.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ApiKeyReader {
    public static String getApiKey(){
        Properties properties = new Properties();
        try{
            FileInputStream file= new FileInputStream("config.properties");
            properties.load(file);
            return properties.getProperty("API_KEY");
        } catch (IOException e){
            System.out.println("Error al leer config.properties: " + e.getMessage());
            return null;
        }
    }
}
