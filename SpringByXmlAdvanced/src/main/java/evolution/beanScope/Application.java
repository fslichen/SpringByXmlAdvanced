package evolution.beanScope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import evolution.beanScope.service.AnyService;

public class Application {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext4BeanScope.xml");
		AnyService anyService = applicationContext.getBean("anyService", AnyService.class);
		applicationContext.close();
	}
}
