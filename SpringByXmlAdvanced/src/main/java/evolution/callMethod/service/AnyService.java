package evolution.callMethod.service;

import lombok.Data;

@Data
public class AnyService {
	private int serviceId;
	
	public static void anyMethod(int id, String name) {
		System.out.println("The ID is " + id + " and the name is " + name + ".");
	}
	
	public void anotherMethod(int id, String name) {
		System.out.println("The ID is " + id + " and the name is " + name + ".");
	}
}
