package cn.bean;

import java.io.Serializable;

/**
 * 用户类
 * @author Sai
 * @param userId:用户id
 * @param userAccount:用户名
 * @param userPassword:用户密码
 */

public class User implements Serializable{

	private String userId;
	private String userAccount;
	private String userPassword;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	public User(String userId, String userAccount, String userPassword) {
		this.userId = userId;
		this.userAccount = userAccount;
		this.userPassword = userPassword;
	}
	
	public User() {
	}
	
	
	
}
