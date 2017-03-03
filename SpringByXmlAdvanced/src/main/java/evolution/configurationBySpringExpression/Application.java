package evolution.configurationBySpringExpression;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import evolution.configurationBySpringExpression.service.AnyService;

public class Application {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext
		= new ClassPathXmlApplicationContext("applicationContext4ConfigurationBySpringExpression.xml");
		AnyService anyService = (AnyService) applicationContext.getBean("anyService");
		System.out.println(anyService);
		applicationContext.close();
	}
}
