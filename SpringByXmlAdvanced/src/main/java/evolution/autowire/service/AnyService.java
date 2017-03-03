package evolution.autowire.service;

import lombok.Data;

@Data
public class AnyService {
	private AnotherService anotherService;
	
	public AnyService() {
		
	}
	
	// This is a typical example of spring IoC.
	// It corresponds to autowire="constructor" under <bean> in applicationContext4Autowire.xml
	public AnyService(AnotherService anotherService) {
		this.anotherService = anotherService;
	}
}
