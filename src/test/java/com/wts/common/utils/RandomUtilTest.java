package com.wts.common.utils;

import static org.junit.Assert.*;


import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void isPhoneNumber() {
		boolean phone = RandomUtil.isPhoneNumber("");
		System.out.println(phone);
	}

	
	@Test
	public void testRandom() {
		// 返回年龄在1-3岁之间
		int i = RandomUtil.random(1,3);
		System.out.println(i);
	}

	@Test
	public void testSubRandom() {
		int[] is = RandomUtil.subRandom(1, 10, 3);
		for (int i : is) {
			System.out.print(i+" ");
		}
	}

	@Test
	public void testRandomCharacter() {
		char i = RandomUtil.randomCharacter();
		System.out.println(i);
	}

	@Test
	public void testRandomString() {
		String randomString = RandomUtil.randomString(4);
		System.out.println(randomString);
	}

}
