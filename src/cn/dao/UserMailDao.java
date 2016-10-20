package cn.dao;

import java.io.File;
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
	 * @param user 所选用户
	 * @return 用户发送过的邮件的集合
	 */
	public Set<Mail> getMails(User user);
	
	/**
	 * 发送邮件
	 * @param user 发件人
	 * @param mail 需要发送的邮件
	 * @param mailList 存储邮件的集合
	 * @param umList 存储关联关系的集合
	 * @return 若发送成功返回true，否则返回false 
	 * 
	 */
	public boolean sendMail(User user, Mail mail, Set<Mail> mailList, 
			Set<UserMail> umList);
	
	/**
	 * 删除收到的邮件
	 * @param user 该邮件的收件人
	 * @param mail 需要删除的邮件
	 * @param mailList 存储邮件的集合
	 * @param umList 存储关联关系的集合
	 * @return 若删除成功返回true，否则返回false
	 */
	public boolean deleteMail(User user, Mail mail, Set<Mail> mailList,
			Set<UserMail> umList);
	
	/**
	 * 将关联数据写入文件
	 * @param umList 存储关联数据的集合
	 * @param umFile 需要写入的文件对象
	 * @return 写入成功返回true,否侧返回false
	 */
	public boolean writeToFile(Set<UserMail> umList, File umFile);
	
}
