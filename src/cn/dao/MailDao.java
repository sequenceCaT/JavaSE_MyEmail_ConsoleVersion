package cn.dao;

import java.io.File;
import java.util.Set;

import cn.bean.Mail;

/**
 * �ʼ��Ĳ�����
 * @author Sai
 *
 */

public interface MailDao {

	/**
	 * ����һ���ʼ�
	 * @param mailId �ʼ�id��ͨ�����������
	 * @param mailDate ��������
	 * @param mailContent �ʼ�����
	 * @return ���ɵ��ʼ����������
	 */
	public Mail createMail(String mailId, String mailDate, String mailContent);
	
	/**
	 * ���ʼ��б�д���ļ���
	 * @param mailList
	 * @param mailFile
	 * @return
	 */
	public boolean WriteToFile(Set<Mail> mailList, File mailFile);
	
	/**
	 * ��ȡ�����ļ�
	 * @param mailFile �洢�ʼ��б���ļ�
	 * @return ���ر�ʾ�ʼ��б�ļ���
	 */
	public Set<Mail> readFromFile(File mailFile);
}
