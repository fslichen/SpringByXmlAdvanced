package evolution.beanInheritance;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext4BeanInheritance.xml");
		AnyClass anyClass = applicationContext.getBean("anyClass", AnyClass.class);
		System.out.println(anyClass);
		AnotherClass anotherClass = applicationContext.getBean("anotherClass", AnotherClass.class);
		System.out.println(anotherClass);
		applicationContext.close();
	}
}
