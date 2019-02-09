package dao.imp;

import dao.UserDaoI;

//123456 + 123789
public class UserDaoImpOracle implements UserDaoI {

	@Override
	public void saveUser() {
		System.out.println("Oracle 保存了用户");


	}

}
