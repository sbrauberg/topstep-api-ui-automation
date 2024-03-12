package com.topstep.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationWriter {
    private static final Properties properties = new Properties();

    static {

        try {
            FileInputStream file = new FileInputStream("configuration.properties");
            properties.load(file);
            file.close();
        } catch (IOException e) {

            System.out.println("Error writing Configuration properties: " + e.getMessage());


        }

    }

    public static void setProperty(String keyword, String value) {
        properties.setProperty(keyword, String.valueOf(value));

        try {
            FileOutputStream outputStream = new FileOutputStream("configuration.properties");
            properties.store(outputStream, null);
        } catch (IOException e) {

            System.out.println("Error writing Configuration properties: " + e.getMessage());


        }
    }
}
