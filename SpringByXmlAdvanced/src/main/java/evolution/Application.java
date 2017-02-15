package evolution;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import evolution.service.AnyService;

public class Application {
	public static void main(String[] args) {
		// Put the applicationContext.xml under the resource folder.
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		AnyService anyService = (AnyService) applicationContext.getBean("anyService");// You can use applicationContext to get the bean.
		System.out.println(anyService);
		applicationContext.close();
	}
}
