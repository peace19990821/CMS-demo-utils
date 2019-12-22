package com.wts.common.utils;

import java.awt.geom.Point2D;

public class DistanceUtil {

	 private static final double EARTH_RADIUS = 6371393; // ƽ���뾶,��λ��m
	 //���뾭γ�ȣ��������������ľ���
	  public static double getDistance(double j1,double w1,double j2,double w2) {
	    	 Point2D pointDD = new Point2D.Double(j1, w1);
		     Point2D pointXD = new Point2D.Double(j2, w2);
			return calculate(pointDD, pointXD);
	    }
	    /**
	     * ͨ��AB�㾭γ�Ȼ�ȡ����
	     * @param pointA A��(����γ)
	     * @param pointB B��(����γ)
	     * @return ����(��λ����)
	     */
	    public static double calculate(Point2D pointA, Point2D pointB) {
	        // ��γ�ȣ��Ƕȣ�ת���ȡ����������������Ե���Math.cos��Math.sin
	        double radiansAX = Math.toRadians(pointA.getX()); // A������
	        double radiansAY = Math.toRadians(pointA.getY()); // Aγ����
	        double radiansBX = Math.toRadians(pointB.getX()); // B������
	        double radiansBY = Math.toRadians(pointB.getY()); // Bγ����
	        double cos = Math.cos(radiansAY) * Math.cos(radiansBY) * Math.cos(radiansAX - radiansBX)
	                + Math.sin(radiansAY) * Math.sin(radiansBY);
	        double acos = Math.acos(cos); // ������ֵ
	        return EARTH_RADIUS * acos; // ���ս��
	    }
	    
	    public static void main(String[] args) {
	        // ���� ��������վ
	       // Point2D pointDD = new Point2D.Double(116.425249, 39.914504);
	        // ���� ��������վ
	       // Point2D pointXD = new Point2D.Double(116.382001, 39.913329);
	    	double d = getDistance(116.425249, 39.914504,116.382001, 39.913329);
	        System.out.println("����ľ���:"+d+"��");
	    }
}
