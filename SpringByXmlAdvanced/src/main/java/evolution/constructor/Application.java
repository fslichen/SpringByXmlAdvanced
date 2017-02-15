package evolution.constructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import evolution.constructor.service.AnyService;

public class Application {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext
		= new ClassPathXmlApplicationContext("applicationContext4Constructor.xml");
		AnyService anyService = (AnyService) applicationContext.getBean("anyService");
		System.out.println(anyService);
		applicationContext.close();
	}
}
