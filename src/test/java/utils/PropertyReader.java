package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {

    public static String getUrl() throws IOException {
        return getProperty("url");
    }

    public static Browser getBrowser() throws IOException {
        return Browser.valueOf(getProperty("browser"));
    }

    private static String getProperty(String propertyName) throws IOException {

        if(System.getProperty(propertyName) == null){
            // Определяем, если у property имя = null, значит оно не было определено через консоль
            // mvn clean test -Durl = 'null'
            // Если имя не было определено через консоль, оно будет браться из файла
            return  getPropertyFromFile(propertyName);
        } else {
            return System.getProperty(propertyName);
        }
    }

    private static String getPropertyFromFile(String propertyName) throws IOException {

        Properties prop = new Properties();
        InputStream input = null;

        try {
            input = new FileInputStream("src/test/resources/framework.properties");
            prop.load(input);
        } catch (FileNotFoundException exe) {
            exe.printStackTrace();
        } catch (IOException ex) {
            System.out.println("Cannot read property value for " + propertyName);
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return prop.getProperty(propertyName);
    }
}

