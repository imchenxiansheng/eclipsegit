package ui;

import service.UserServiceI;
import service.imp.UserServiceImp;

public class MainDemo {
	
	public static void main(String[] args) {
		UserServiceI uService = new UserServiceImp();
		uService.saveUser();
	}

}
