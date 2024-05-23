package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtility {

	public String readProperty(String key) throws IOException {
		// step 1-->get obj of external file
		FileInputStream fis = new FileInputStream("./data/dwscommon.properties");
		// step 2-->create an obj for Properties class
		Properties prob = new Properties();
		// step 3-->load the external file
		prob.load(fis);
		// step 4-->read data
		String data = prob.getProperty(key);
		return data;
	}

}
