package evolution.annotation.common;

import org.springframework.stereotype.Component;

@Component
public class EmailSender {
	public void send(){
		System.out.println("Sent");
	}
}
