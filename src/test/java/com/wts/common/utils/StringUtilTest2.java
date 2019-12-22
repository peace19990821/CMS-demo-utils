package com.wts.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

public class StringUtilTest2 {

	@Test
	public void testJudgeTelephoneIsOk() {
		boolean number = StringUtil.isNumber("15128460821");
		System.out.println(number);
	}

	@Test
	public void testIsNumber() {
		boolean number = StringUtil.isNumber("2");
		System.out.println(number);
		boolean number2 = StringUtil.isNumber("asdsa");
		System.out.println(number2);
	}

	@Test
	public void testHasText() {
		boolean b = StringUtil.hasText("");
		System.out.println(b);
		boolean b1 = StringUtil.hasText("2");
		System.out.println(b1);
		boolean b2 = StringUtil.hasText(" ");
		System.out.println(b2);
	}

}
