package com.gmail.snitchuk99.util.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyManager {

    private FileInputStream fis;
    private String url;
    private Properties properties;

    public PropertyManager(String ulr) throws IOException {
        this.url = url;
        fis = new FileInputStream(new File(ulr));
        properties = new Properties();
        properties.load(fis);
    }

    public String getProp(String key){
        return properties.getProperty(key);
    }

}
