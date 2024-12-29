package utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

	public static Properties InitlizeProperties() {
		Properties prop = new Properties();
		File flo = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Config\\Config.properties");
		try {
			FileInputStream fio = new FileInputStream(flo);
			prop.load(fio);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
	}
	
}
