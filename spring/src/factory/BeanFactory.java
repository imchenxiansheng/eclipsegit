package factory;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public class BeanFactory {
	
	//读取配置文件
	private static ResourceBundle rBundle = ResourceBundle.getBundle("resource.bean");
	//工厂对象实例
	private static BeanFactory beanFactory;
	//创建一个容器 ，存放bean， 
	private static Map<String,Object> map = new HashMap<String,Object>();
	
	static{
		//创建工厂对象
		beanFactory = new BeanFactory();
		//初始化容器
		try {
		
			Enumeration<String> keys = rBundle.getKeys();
			while(keys.hasMoreElements()){
				String key = keys.nextElement();
				//每一个key 对应的类路径
				String beanName = rBundle.getString(key);
				//实例对象
				Object bean = Class.forName(beanName).newInstance();
				map.put(key, bean);
			}
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
			throw new ExceptionInInitializerError("初始化容器异常");
		}
				
	}
	
	public BeanFactory(){
		
	}
	
	public static BeanFactory  getBeanFactory(){
		return beanFactory;
	}
	
	/**
	 * 根据beanName 生成一个bean 的实例
	 * 问题：每次都是一个新的对象
	 * @param beanName
	 * @return
	 */
	/*public Object getBean(String beanName){
		Object bean = null;
		try{
			String value = rBundle.getString(beanName);
			bean = Class.forName(value).newInstance();
			return bean;
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}*/
	
	public Object getBean(String beanName){
		return map.get(beanName);
	}

}
