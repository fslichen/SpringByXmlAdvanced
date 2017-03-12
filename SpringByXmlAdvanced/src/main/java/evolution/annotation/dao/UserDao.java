package evolution.annotation.dao;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDao {
	public void save(){
		System.out.println("Saved");
	}
}
