package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {

    Properties properties;

    public ConfigDataProvider() {

        try {
            FileInputStream fileInputStream = new FileInputStream("test/resource/configuration.properties");
            properties = new Properties();
            properties.load(fileInputStream);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getUrl() {
        return properties.getProperty("homeDepotURL");
    }
    public String getExcelPath() {
        return properties.getProperty("excelPath");
    }
    public String getDatabaseURL (){
        return properties.getProperty("databaseULR");
    }
    public String getDatabaseUsername (){
        return properties.getProperty("databaseUserName");
    }
    public String getDatabasePassword (){
        return properties.getProperty("databasePassword");
    }
}

