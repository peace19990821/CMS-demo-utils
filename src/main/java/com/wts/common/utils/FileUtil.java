package com.wts.common.utils;

import java.io.File;

/**
 * @ClassName: FileUtil 
 * @Description: �ļ�������
 * @author:wts 
 * @date: 2019��12��6�� ����1:23:26
 */
public class FileUtil {

	/*
	* ����1������һ���ļ��������ظ��ļ�������չ�������硰aaa.jpg�������ء�.jpg��(3��)
	*/
	public static String getExtendName(String fileName){
		//����ļ���Ϊ���򷵻�null
		if(!StringUtil.hasText(fileName))
			return null;
		return  fileName.substring(fileName.lastIndexOf("."));
	}
	/*
	* ����2�����ز���ϵͳ��ʱĿ¼(5��)
	*/
	public static File getTempDirectory(){
		
		String path = System.getProperty("java.io.tmpdir");
		
		return new File(path);
	}
	/*
	* ����3�����ز���ϵͳ�û�Ŀ¼(5��)
	* ����Linuxϵͳ����/home/{�û��˺���}��Windowsϵͳ����C:\Users\{�û��˺���}> 
	*/
	public static File getUserDirectory(){
	String path = System.getProperty("user.home");
		
		return new File(path);
	}
}
