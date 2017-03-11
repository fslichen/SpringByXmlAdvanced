package evolution.util.service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class AdminService {
	public static final String STATIC_STRING = "Goodbye Past";
	private String string;
	private int[] intArray;
	private List<String> list;
	private Set<String> set;
	private Map<String, String> map;
	private Properties properties;
	private Date date;
	
	public String getString() {
		return string;
	}
	
	public void setString(String string) {
		this.string = string;
		System.out.println(this.string);
	}
	
	public int[] getIntArray() {
		return intArray;
	}
	
	public void setIntArray(int[] intArray) {
		this.intArray = intArray;
		Arrays.toString(intArray);
	}
	
	public List<String> getList() {
		return list;
	}
	
	public void setList(List<String> list) {
		this.list = list;
		System.out.println(list);
	}
	
	public Set<String> getSet() {
		return set;
	}
	
	public void setSet(Set<String> set) {
		this.set = set;
		System.out.println(set);
	}
	
	public Map<String, String> getMap() {
		return map;
	}
	
	public void setMap(Map<String, String> map) {
		this.map = map;
		System.out.println(map);
	}
	
	public Properties getProperties() {
		return properties;
	}
	
	public void setProperties(Properties properties) {
		this.properties = properties;
		System.out.println(properties);
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
		System.out.println(date);
	}
}
