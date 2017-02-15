package evolution.imported;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import evolution.setter.service.AnyService;

public class ImportedService {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		AnyService anyService = (AnyService) applicationContext.getBean("anyService");
		System.out.println(anyService);
	}
}
