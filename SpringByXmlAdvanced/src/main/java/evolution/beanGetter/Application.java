package evolution.beanGetter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext4Getter.xml");
		String string = applicationContext.getBean("anyName", String.class);
		System.out.println(string);
	}
}
