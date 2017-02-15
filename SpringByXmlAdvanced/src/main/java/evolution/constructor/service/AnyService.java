package evolution.constructor.service;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AnyService {
	private String name;
	private String gender;
	private String hobby;
	private List<String> states;
	private List<Map<String, String>> maps;
	private Set<String> set;
	private Properties properties;
	private AnotherService anotherService;
	private TheOtherService theOtherService0;
	private TheOtherService theOtherService1;
	private String address;
	
	public AnyService(String name, String gender, String hobby, List<String> states, List<Map<String, String>> maps,
			Set<String> set, Properties properties, AnotherService anotherService, TheOtherService theOtherService0,
			TheOtherService theOtherService1, String address) {
		super();
		this.name = name;
		this.gender = gender;
		this.hobby = hobby;
		this.states = states;
		this.maps = maps;
		this.set = set;
		this.properties = properties;
		this.anotherService = anotherService;
		this.theOtherService0 = theOtherService0;
		this.theOtherService1 = theOtherService1;
		this.address = address;
	}
}
