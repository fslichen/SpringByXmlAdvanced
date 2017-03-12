package evolution.annotation.service;

import org.springframework.stereotype.Service;

@Service("anyService")
public class AnyService {
	public void anyMethod() {
		System.out.println("Hello World");
	}
}
