package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {
	Properties properties = new Properties();
	InputStream inputStream = null;

	public PropertyReader() {
		loadProperties();
	}

	private void loadProperties() {
		String workingDir = System.getProperty("user.dir");
		try {
			inputStream = new FileInputStream(workingDir+"/src/test/java/config.properties");
			properties.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String readProperty(String key) {
		return properties.getProperty(key);
	}
}
