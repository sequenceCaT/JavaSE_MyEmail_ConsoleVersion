package cn.dao;

import java.util.Set;
import cn.bean.Mail;
import cn.bean.User;
import cn.bean.UserMail;

/**
 * 邮件与用户的交互操作
 * @author Sai
 *
 */
public interface UserMailDao {

	/**
	 * 取得用户发送过的邮件
	 * @param user：所选用户
	 * @return 用户发送过的邮件的集合
	 */
	public Set<Mail> getMails(User user);
	
	/**
	 * 发送邮件
	 * @param user：发件人
	 * @param mail：需要发送的邮件
	 * @param mailList：存储邮件的集合
	 * @param umList：存储关联关系的集合
	 * @return 若发送成功返回true，否则返回false
	 */
	public boolean sendMail(User user, Mail mail, Set<Mail> mailList, 
			Set<UserMail> umList);
	
	/**
	 * 删除收到的邮件
	 * @param user：该邮件的收件人
	 * @param mail：需要删除的邮件
	 * @param mailList：存储邮件的集合
	 * @param umList：存储关联关系的集合
	 * @return 若删除成功返回true，否则返回false
	 */
	public boolean deleteMail(User user, Mail mail, Set<Mail> mailList,
			Set<UserMail> umList);
	
}
