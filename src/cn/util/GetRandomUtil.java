package cn.util;

import java.util.Random;

public class GetRandomUtil {

	/**
	 *����������ķ���
	 * @return һ��ʮλ�������
	 */
	public static String getRandom(){
		String value = String.valueOf(Math.abs(new Random().nextInt()));
		if(value.length() == 9){
			value += "0";
		}
		return value;
	}	
	
}
