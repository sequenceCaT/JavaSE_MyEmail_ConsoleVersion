package cn.bean;

import java.io.Serializable;

/**
 * �û����ʼ��Ĺ�����
 * @author Sai
 * @param mailId:�ʼ�id
 * @param sendUserId:���ͷ�id
 * @param receiveUserId:���շ�id
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
