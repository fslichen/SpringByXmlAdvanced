package evolution.constructor.service;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AnyService {
	private String name;
	private String gender;
	private String hobby;
	
	public AnyService(String name, String gender, String hobby) {
		this.name = name;
		this.gender = gender;
		this.hobby = hobby;
	}
}
