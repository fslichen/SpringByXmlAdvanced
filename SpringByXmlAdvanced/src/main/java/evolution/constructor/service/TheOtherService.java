package evolution.constructor.service;

import lombok.Data;

@Data
public class TheOtherService {
	private String name;

	public TheOtherService(String name) {
		super();
		this.name = name;
	}
}
