package evolution.beanCreation;

public class AnyBeanFactory {
	public static AnyService createAnyServiceByStaticMethod() {
		return new AnyService();
	}
	
	public AnyService createAnyServiceByNonStaticMethod() {
		return new AnyService();
	}
}
