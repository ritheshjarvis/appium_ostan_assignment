package com.training.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

    public static PropertyReader getInstance(){
        return new PropertyReader();
    }

    public Properties readProperty(String filePath) throws IOException {
        FileInputStream property = new FileInputStream(filePath);
        Properties prop = new Properties();
        prop.load(property);
        return prop;
    }
}
