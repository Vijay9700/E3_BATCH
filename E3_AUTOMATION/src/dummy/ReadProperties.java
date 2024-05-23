package dummy;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	public static void main(String[] args) throws IOException {
		//step 1-->get obj of external file
		FileInputStream fis=new FileInputStream
				("./data/dwscommon.properties");
		//step 2-->create an obj for Properties class
		Properties prob=new Properties();
		//step 3-->load the external file
		prob.load(fis);
		//step 4-->read data
		String url = prob.getProperty("url");
		String browser = prob.getProperty("browser");
		System.out.println(url);
		System.out.println(browser);
	}

}
