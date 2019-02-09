package cn.itcast;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.service.UserServiceI;

public class ApplicationDemo1 {

	public static void main(String[] args) {
		ApplicationContext aContext = new ClassPathXmlApplicationContext("bean.xml");
		UserServiceI userServiceI = (UserServiceI) aContext.getBean("userService");
		
		userServiceI.saveUser();
		
	}

}
 