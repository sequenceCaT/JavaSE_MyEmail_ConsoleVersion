package cn.dao;

import java.io.File;
import java.util.Set;

import cn.bean.Mail;

/**
 * 邮件的操作层
 * @author Sai
 *
 */

public interface MailDao {

	/**
	 * 生成一封邮件
	 * @param mailId 邮件id，通过随机数生成
	 * @param mailDate 生成日期
	 * @param mailContent 邮件内容
	 * @return 生成的邮件对象的引用
	 */
	public Mail createMail(String mailId, String mailDate, String mailContent);
	
	/**
	 * 将邮件列表写入文件中
	 * @param mailList
	 * @param mailFile
	 * @return
	 */
	public boolean WriteToFile(Set<Mail> mailList, File mailFile);
	
	/**
	 * 读取数据文件
	 * @param mailFile 存储邮件列表的文件
	 * @return 返回表示邮件列表的集合
	 */
	public Set<Mail> readFromFile(File mailFile);
}
