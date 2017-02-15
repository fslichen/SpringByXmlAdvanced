package evolution.service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import lombok.Data;

@Data
public class AnyService {
	private String name;
	private String gender;
	private String hobby;
	private int[] ints;
	private List<String> list;
	private Set<String> set;
	private Map<String, String> map;
	private Properties properties;
	private Date date;
	private AnotherService anotherService;
}
