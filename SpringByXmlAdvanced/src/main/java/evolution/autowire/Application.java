package evolution.autowire;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import evolution.autowire.service.AnyService;

public class Application {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext4Autowire.xml");
		AnyService anyService = applicationContext.getBean("anyService", AnyService.class);
		anyService.getAnotherService().anyMethod();
		applicationContext.close();
	}
}
