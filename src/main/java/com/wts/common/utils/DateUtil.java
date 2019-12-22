package com.wts.common.utils;

import java.util.Calendar;
import java.util.Date;

/**
 * @ClassName: DateUtil 
 * @Description: ���ڵĹ�����
 * @author:wts 
 * @date: 2019��12��6�� ����1:23:50
 */
public class DateUtil {

	//˼��:���������� [20--60] ��֮����������
	
	/*
	* ����1��(5��) ����ָ�����ڵ��³�
	* ��һ��ʱ����󣬷��ظ�ʱ�������µ�1��0ʱ0��0�롣����һ��Date�����ֵ��2019-05-18 11:37:22
	* �򷵻صĽ��Ϊ2019-05-01 00:00:00
	*/
	public static Date getDateByInitMonth(Date src){
		//��ȡ��ǰϵͳʱ���������
		Calendar c = Calendar.getInstance();
		c.setTime(src);//�ô�������ڹ���������
		c.set(Calendar.DAY_OF_MONTH, 1);//�µĵ�һ��
		c.set(Calendar.HOUR_OF_DAY, 0);////���0Сʱ
		c.set(Calendar.MINUTE, 0);/////Сʱ��0��
		c.set(Calendar.SECOND, 0);/////�ֵ�0��
		return c.getTime();//��������ȡ����
	}
	
	/*
	* ����2��(5��) ����ָ�����ڵ���ĩ
	* ��һ��ʱ����󣬷��ظ�ʱ�������µ������23ʱ59��59�룬��Ҫ�����´���С�Ͷ������������
	* ����һ��Date�����ֵ��2019-05-18 11:37:22���򷵻ص�ʱ��Ϊ2019-05-31 23:59:59
	* ����һ��Date�����ֵ��2019-02-05 15:42:18���򷵻ص�ʱ��Ϊ2019-02-28 23:59:59
	*/
	public static Date getDateByFullMonth(Date src){
		//˼·:�ô�������ڵ��¼�1 ,�ٻ�ȡ�µ��³�������.��������ڼ�ȥ 1��
		Calendar c = Calendar.getInstance();
		c.setTime(src);
		
		c.add(Calendar.MONTH, 1);//���·ݼ�1
		Date date = getDateByInitMonth(c.getTime());//��ȡ�·ݼ�1 ���³�������
		c.setTime(date);//���³������ڵĳ�ʼ��������
		c.add(Calendar.SECOND, -1);//�����ڼ�ȥ1��
		return c.getTime();
	}
	
	
	
	//����ָ����Χ���������.�� 2010��1��1�������������ʱ��
	public static Date randomDate(Date d1,Date d2) {
		
		//��ʼ�ĺ�����
		long l1 = d1.getTime();
		//�����ĺ�����
		long l2 = d2.getTime();
		
		
		
		long l3= (long) ((Math.random() * (l2-l1 +1)) +l1);
		
		return new Date(l3);
		
	}
	
	/*
	 * @SuppressWarnings("deprecation") public static void main(String[] args) {
	 * 
	 * Date date1 = new Date("2010/01/01");
	 * 
	 * Date date = DateUtil.randomDate(date1, new Date());
	 * 
	 * 
	 * SimpleDateFormat df =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	 * System.out.println(df.format(date)); }
	 */
}
