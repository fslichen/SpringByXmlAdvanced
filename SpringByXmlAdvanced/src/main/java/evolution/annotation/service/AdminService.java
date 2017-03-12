package evolution.annotation.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import evolution.annotation.common.EmailSender;
import evolution.annotation.dao.UserDao;

@Lazy(true) // Corresponds to <bean lazy-init="true"/>
@Scope("singleton") // Corresponds to <bean scope="singleton|prototype|request|session"/>
@Service("adminService") // Corresponds <bean id="adminService" class="evolution.annotation.service.AdminService">
public class AdminService {
	// Injection by Name
	// @Resource is for field injection only.
	@Resource(name="userDao")
	private UserDao userDao;
	
	// Injection by Type
	// If two components are tagged with either @Service, @Repository or @Component, ambiguity arises.
	// That is why @Autowired is sometimes used along with @Qualifier to rule out the ambiguity.
	// @Autowired can be used for constructor injection.
	@Autowired(required=true)
	private EmailSender emailSender;
	
	// @Qualifier should not be used alone. 
	// @Autowired and @Qualifier can be used together in order to rule out the ambiguity.
	@Autowired
	@Qualifier("anyService")// Injection by Name
	private AnyService anyService;
	
	public AdminService(){
		
	}
	
	public void anyMethod(){
		userDao.save();
		emailSender.send();
		anyService.anyMethod();
	}
	
	@PostConstruct// Corresponds to <bean init-method="init"/>
	public void init(){
		System.out.println("Initialized");
	}
	
	@PreDestroy // Corresponds to <bean destory-method="destroy"/>
	public void destory(){
		System.out.println("Destroyed");
	}
}