package com.wts.common.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: StreamUtil 
 * @Description: ��������
 * @author:wts 
 * @date: 2019��12��6�� ����1:22:40
 */
public class StreamUtil {

	/*
	 * ����1�������ر����������ܴ����޸���(3��) �ɱ���� ���紫��FileInputStream����JDBC��Connection���󶼿��Թرա�
	 */
	public static void closeAll(AutoCloseable... autoCloseable) {

		if (null != autoCloseable && autoCloseable.length > 0) {
			for (AutoCloseable autoCloseable2 : autoCloseable) {
				try {
					autoCloseable2.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

	}

	/*
	 * ����2������һ���ı��ļ�����Ĭ��ΪUTF-8���룬���ظ��ļ�����(3��)��Ҫ�󷽷��ڲ����������1�������ر���(3��)
	 */
	public static String readTextFile(InputStream src) {

		byte[] b = new byte[1024];
		int x = 0;
		String str = "";
		try {
			while ((x = src.read(b)) != -1) {
				str += new String(b, 0, x, "utf-8");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {// ����
			closeAll(src);
		}
		return str;
	}

	/*
	 * ����3�������ı��ļ����󣬷��ظ��ļ�����(3��)������Ҫ���ڲ����������2������(5��)��* ���ǵ��͵ķ������أ���ס�������ꡭ
	 */
	public static String readTextFile(File txtFile) throws FileNotFoundException {
		return readTextFile(new FileInputStream(txtFile));
	}

	/**
	 * 
	 * @Title: readLineTextFile
	 * @Description: һ���ж�ȡ�ļ���д��list����
	 * @return
	 * @return: List<String>
	 */
	public static List<String> readLineTextFile(File txtFile) {
		List<String> list = new ArrayList<String>();
		BufferedReader bf = null;
		try {
			bf = new BufferedReader(new InputStreamReader(new FileInputStream(txtFile)));
			String str = "";
			while ((str = bf.readLine()) != null) {
				list.add(str);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			closeAll(bf);
		}

		return list;
	}
	
	/**
	 * 
	 * @Title: read
	 * @Description: һ���ж�ȡ�ļ�������list������
	 * @param inputStream
	 * @return
	 * @return: List<String>
	 * @throws IOException 
	 */
	public static List<String> read(InputStream inputStream) throws IOException{
		
		BufferedReader read = new BufferedReader(new InputStreamReader(inputStream));
		List<String> list = new ArrayList<String>();
		String str="";
		while((str=read.readLine())!=null) {
			list.add(str);
		}
		return list;
	}
}
