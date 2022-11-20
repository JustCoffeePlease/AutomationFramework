/*
package other.PropertyReader;

import other.DriverFactory.DFBrowser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class other.PropertyReader {

    public static String getBaseUrl() {
        return getProperty("url");
    }
    public static DFBrowser getBrowser() {
        return DFBrowser.valueOf(getProperrty("browser"));
    }
    private static String getProperty(String propertyName) throws IOException {
        if (System.getProperty(propertyName) == null) {
            return getPropertyFromFile(propertyName);
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
            e.printStackTrace();
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
*/
