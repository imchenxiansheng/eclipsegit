package service.imp;

import dao.UserDaoI;
import dao.imp.UserDaoImpMysql;
import dao.imp.UserDaoImpOracle;
import factory.BeanFactory;
import service.UserServiceI;

public class UserServiceImp implements UserServiceI {

	private UserDaoI userDao = (UserDaoI) BeanFactory.getBeanFactory().getBean("USERDAOORACLE");
	@Override
	public void saveUser() {
		userDao.saveUser();
	}

}
