package dao.imp;

import dao.UserDaoI;

public class UserDaoImpMysql implements UserDaoI {

	@Override
	public void saveUser() {
		System.out.println("Mysql 保存了用户");

	}

}
