package com.qa.restfulbooker.config;

import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    public static String get(String key) {
        Properties props = new Properties();

        try (InputStream input = ConfigReader.class
                .getClassLoader()
                .getResourceAsStream("config.properties")) {
            props.load(input);
        } catch (Exception e) {
            throw new RuntimeException("Cannot read config.properties", e);
        }

        return props.getProperty(key);
    }

    public static String getUiBaseUrl() {
        return get("ui.base.url");
    }
}