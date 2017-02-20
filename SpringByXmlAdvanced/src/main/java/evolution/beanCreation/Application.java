package evolution.beanCreation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanCreationApplicationContext.xml");
		AnyService anyServiceByStaticMethod = applicationContext.getBean("anyServiceByStaticMethod", AnyService.class);
		anyServiceByStaticMethod.anyMethod();
		AnyService anyServiceByNonStaticMethod = applicationContext.getBean("anyServiceByNonStaticMethod", AnyService.class);
		anyServiceByNonStaticMethod.anyMethod();
	}
}
