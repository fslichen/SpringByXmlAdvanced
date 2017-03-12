package evolution.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import evolution.annotation.service.AdminService;

public class SpringTest {
	public static void main(String[] args) {
		// Get the spring container. 
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext4Annotation.xml");
		AdminService adminService = applicationContext.getBean("adminService", AdminService.class);
		adminService.anyMethod();
		applicationContext.close();
	}
}
