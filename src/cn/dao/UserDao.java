package cn.dao;

import java.io.File;
import java.util.Set;

import cn.bean.User;

/**
 * �û������ݲ�����
 * @author Sai
 *
 */
public interface UserDao {

	/**
	 * ��½����
	 * @param userList���洢�����û���List���ϣ����鴫��TreeSet��ʵ��
	 * @param userAccount����½�û���
	 * @param password����½����
	 * @return ��½�û������ã�����½ʧ�ܷ���null
	 */
	public User login(Set<User> userList, String userAccount, String password);
	
	/**
	 * ע�����
	 * @param userList���洢�����û���List���ϣ����鴫��TreeSet��ʵ��
	 * @param userAccount��ע���û���
	 * @param password��ע������
	 * @return ע���û������ã���ע��ʧ�ܷ���null
	 */
	public User register(Set<User> userList, String userAccount, String password);
	
	/**
	 * ���û�����д���ļ�
	 * @param userList���洢�û����ݵļ���
	 * @param userFile����д���ļ�
	 * @return д��ɹ�����true�����򷵻�false
	 */
	public boolean writeToFile(Set<User> userList,File userFile);
	
	/**
	 * ���ļ��ж�ȡ�û����ݲ��ŵ�������
	 * @param userFile���洢�û����ݵ��ļ�
	 * @return �洢�û����ݵļ��ϣ����ļ������ڻ������������򷵻�һ���ռ���
	 */
	public Set<User> readFromFile(File userFile);
	
}
