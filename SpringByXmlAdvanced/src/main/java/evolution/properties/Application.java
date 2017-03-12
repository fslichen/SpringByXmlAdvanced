package evolution.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import evolution.properties.service.AdminService;

public class Application {
	public static void main(String[] args) {
		// 获取Spring容器
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext4Properties.xml");
		AdminService adminService = applicationContext.getBean("adminService", AdminService.class);
		System.out.println(adminService);
		applicationContext.close();
	}
}
