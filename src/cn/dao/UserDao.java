package cn.dao;

import java.io.File;
import java.util.Set;

import cn.bean.User;

/**
 * 用户的数据操作层
 * @author Sai
 *
 */
public interface UserDao {

	/**
	 * 登陆操作
	 * @param userList：存储所有用户的List集合，建议传入TreeSet的实例
	 * @param userAccount：登陆用户名
	 * @param password：登陆密码
	 * @return 登陆用户的引用，若登陆失败返回null
	 */
	public User login(Set<User> userList, String userAccount, String password);
	
	/**
	 * 注册操作
	 * @param userList：存储所有用户的List集合，建议传入TreeSet的实例
	 * @param userAccount：注册用户名
	 * @param password：注册密码
	 * @return 注册用户的引用，若注册失败返回null
	 */
	public User register(Set<User> userList, String userAccount, String password);
	
	/**
	 * 将用户数据写入文件
	 * @param userList：存储用户数据的集合
	 * @param userFile：待写入文件
	 * @return 写入成功返回true，否则返回false
	 */
	public boolean writeToFile(Set<User> userList,File userFile);
	
	/**
	 * 从文件中读取用户数据并放到集合中
	 * @param userFile：存储用户数据的文件
	 * @return 存储用户数据的集合，若文件不存在或者其它错误则返回一个空集合
	 */
	public Set<User> readFromFile(File userFile);
	
}
