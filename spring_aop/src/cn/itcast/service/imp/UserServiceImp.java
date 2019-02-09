package cn.itcast.service.imp;

import cn.itcast.service.UserServiceI;

public class UserServiceImp implements UserServiceI {

	@Override
	public void saveUser() {
		System.out.println("保存一个用户");
	}

	@Override
	public void updateUser(int id) {
		System.out.println("跟新了一个用户");
	}

}
