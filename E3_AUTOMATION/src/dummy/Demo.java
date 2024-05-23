package dummy;

import java.util.Random;

import org.openqa.selenium.WebDriver;

public class Demo {
	public static void main(String[] args) {
		Random r=new Random();
		int c = r.nextInt(99);
		System.out.println(c);
	}

}
