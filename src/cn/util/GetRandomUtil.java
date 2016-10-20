package cn.util;

import java.util.Random;

public class GetRandomUtil {

	/**
	 *生成随机数的方法
	 * @return 一个十位的随机数
	 */
	public static String getRandom(){
		String value = String.valueOf(Math.abs(new Random().nextInt()));
		if(value.length() == 9){
			value += "0";
		}
		return value;
	}	
	
}
