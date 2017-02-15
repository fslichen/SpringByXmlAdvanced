package evolution.constructor.service;

import lombok.Data;

@Data
public class AnotherService {
	private String socialSecurityNumber;

	public AnotherService(String socialSecurityNumber) {
		super();
		this.socialSecurityNumber = socialSecurityNumber;
	}
}
