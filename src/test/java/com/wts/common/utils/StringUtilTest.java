package com.wts.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		boolean b1 = StringUtil.hasLength(null);
		System.out.println(b1);
		boolean b2 = StringUtil.hasLength("");
		System.out.println(b2);
	}

	@Test
	public void testHasText() {
		boolean c = StringUtil.hasText(null);
		System.out.println(c);
		boolean c1 = StringUtil.hasText("");
		System.out.println(c1);
		boolean c2 = StringUtil.hasText(" ");
		System.out.println(c2);
	}
}
