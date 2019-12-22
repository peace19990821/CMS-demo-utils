package com.wts.common.utils;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @ClassName: RandomUtil 
 * @Description: 随机数工具类
 * @author:wts 
 * @date: 2019年12月5日 下午1:23:21
 */
public class RandomUtil {
	
	
	// 校验是否是手机号
	public static boolean isPhoneNumber(String str) {
		// 手机号规则
		String regex = "1[|3|5|6|7|8|9]\\d{9}";
		return str.matches(regex);
		
	}
	
	//方法1：返回min-max之间的随机整数（包含min和max值），例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对。 (5分)
	public static int random(int min, int max){
		Random random = new Random();
		return random.nextInt(max - min + 1) + min;
	}
	
	//方法2：在最小值min与最大值max之间截取subs个不重复的随机数。例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了。应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。 (8分)
	public static int[] subRandom (int min, int max, int subs){
		// 声明用来存放随机数的数组对象
		int[] array = new int[subs];
		// 通过set过滤重复的数据
		Set<Integer> set = new HashSet<>();
		while(set.size() != subs) {
			set.add(random(min, max));
		}
		// 把set转为数组
		int i = 0;
		for (Integer j : set) {
			array[i] = j;
			i++;
		}
		return array;
	}
	
	//方法3：返回1个1-9,a-Z之间的随机字符。 (8分)
	public static char randomCharacter (){
		String str = "123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLMNBVCXZ";
		return str.charAt(random(0,str.length() - 1));
	}
	
	//方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
	public static String randomString(int length){
		String str = "";
		for (int i = 0; i < length; i++) {
			str+=randomCharacter();
		}
		return str;
	}
}
