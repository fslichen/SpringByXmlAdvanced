package evolution.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
		// Obtain the spring container.
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext4Util.xml");
		Object classVariable = applicationContext.getBean("staticStringId");
		System.out.println(classVariable);
		applicationContext.close();
	}
}
