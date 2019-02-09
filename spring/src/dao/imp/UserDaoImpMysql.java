package dao.imp;

import dao.UserDaoI;
//在远程仓库端修改的内容
//远程 2次修改
//123
//456
public class UserDaoImpMysql implements UserDaoI {

	@Override
	public void saveUser() {
		System.out.println("Mysql 保存了用户");

	}

}
