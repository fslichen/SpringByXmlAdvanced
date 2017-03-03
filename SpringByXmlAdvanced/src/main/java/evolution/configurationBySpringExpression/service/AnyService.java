package evolution.configurationBySpringExpression.service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import lombok.Data;

@Data
public class AnyService {
	private String name;
	private int[] ints;
	private List<String> lists;
	private Set<String> sets;
	private Map<String, String> maps;
	private Properties properties;
	private Date date;
}
