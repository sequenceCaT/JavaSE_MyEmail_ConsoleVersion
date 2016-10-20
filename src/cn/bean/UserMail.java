package cn.bean;

import java.io.Serializable;

/**
 * 用户与邮件的关联类
 * @author Sai
 * @param mailId:邮件id
 * @param sendUserId:发送方id
 * @param receiveUserId:接收方id
 */
public class UserMail implements Serializable{

	private String mailId;
	private String sentUserId;
	private String receiveUserId;
	
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getSentUserId() {
		return sentUserId;
	}
	public void setSentUserId(String sentUserId) {
		this.sentUserId = sentUserId;
	}
	public String getReceiveUserId() {
		return receiveUserId;
	}
	public void setReceiveUserId(String receiveUserId) {
		this.receiveUserId = receiveUserId;
	}
	
	public UserMail(String mailId, String sentUserId, String receiveUserId) {
		this.mailId = mailId;
		this.sentUserId = sentUserId;
		this.receiveUserId = receiveUserId;
	}
	
	public UserMail() {
	}
	
}
