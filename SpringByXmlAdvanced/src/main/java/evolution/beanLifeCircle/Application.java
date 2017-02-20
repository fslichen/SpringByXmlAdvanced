package evolution.beanLifeCircle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) throws InterruptedException {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext4BeanLifeCircle.xml");
		AnyClass anyClass = applicationContext.getBean("anyClass", AnyClass.class);
	}
}
