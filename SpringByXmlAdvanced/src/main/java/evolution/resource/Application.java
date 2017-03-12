package evolution.resource;

import java.util.Properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import evolution.resource.service.AdminService;


public class Application {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext4Resource.xml");
		AdminService adminService = applicationContext.getBean("adminService", AdminService.class);
		Properties prop = adminService.getResource();
		System.out.println(prop.get("url"));
		applicationContext.close();
	}
}
