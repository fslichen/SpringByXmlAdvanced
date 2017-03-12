package evolution.resource.service;

import java.io.IOException;
import java.util.Properties;

import org.springframework.core.io.Resource;

public class AdminService {
	private Resource resource;
	
	public AdminService(){

	}

	public Properties getResource() {
		Properties prop = new Properties();
		try {
			prop.load(resource.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
	
	public void setResource(Resource resource) {
		this.resource = resource;
	}
}
