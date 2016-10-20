package cn.bean;

import java.io.Serializable;
import java.util.Calendar;

/**
 * �ʼ���
 * @author Sai
 * @param mailId���ʼ�id
 * @param mailDate����������
 * @param mailContent���ʼ�����
 */
public class Mail implements Serializable{

	private String mailId;
	private Calendar mailDate;
	private String mailComtent;
	
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public Calendar getMailDate() {
		return mailDate;
	}
	public void setMailDate(Calendar mailDate) {
		this.mailDate = mailDate;
	}
	public String getMailComtent() {
		return mailComtent;
	}
	public void setMailComtent(String mailComtent) {
		this.mailComtent = mailComtent;
	}
	
	public Mail(String mailId, Calendar mailDate, String mailComtent) {
		this.mailId = mailId;
		this.mailDate = mailDate;
		this.mailComtent = mailComtent;
	}
	
	public Mail() {
	}
	
}
