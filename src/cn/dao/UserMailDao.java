package cn.dao;

import java.io.File;
import java.util.Set;

import cn.bean.Mail;
import cn.bean.User;
import cn.bean.UserMail;

/**
 * �ʼ����û��Ľ�������
 * @author Sai
 *
 */
public interface UserMailDao {

	/**
	 * ȡ���û����͹����ʼ�
	 * @param user ��ѡ�û�
	 * @return �û����͹����ʼ��ļ���
	 */
	public Set<Mail> getMails(User user);
	
	/**
	 * �����ʼ�
	 * @param user ������
	 * @param mail ��Ҫ���͵��ʼ�
	 * @param mailList �洢�ʼ��ļ���
	 * @param umList �洢������ϵ�ļ���
	 * @return �����ͳɹ�����true�����򷵻�false 
	 * 
	 */
	public boolean sendMail(User user, Mail mail, Set<Mail> mailList, 
			Set<UserMail> umList);
	
	/**
	 * ɾ���յ����ʼ�
	 * @param user ���ʼ����ռ���
	 * @param mail ��Ҫɾ�����ʼ�
	 * @param mailList �洢�ʼ��ļ���
	 * @param umList �洢������ϵ�ļ���
	 * @return ��ɾ���ɹ�����true�����򷵻�false
	 */
	public boolean deleteMail(User user, Mail mail, Set<Mail> mailList,
			Set<UserMail> umList);
	
	/**
	 * ����������д���ļ�
	 * @param umList �洢�������ݵļ���
	 * @param umFile ��Ҫд����ļ�����
	 * @return д��ɹ�����true,��෵��false
	 */
	public boolean writeToFile(Set<UserMail> umList, File umFile);
	
}
