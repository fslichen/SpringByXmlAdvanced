package evolution.callMethod;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext4CallMethodAndField.xml");
		Object anyMethod = applicationContext.getBean("anyMethod");
		applicationContext.close();
	}
}
