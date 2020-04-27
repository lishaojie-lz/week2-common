package com.lishaojie.common.utils;

import java.util.HashSet;
import java.util.Random;

/**
 * 
 * @ClassName: RandNumUtils 
 * @Description: �����ֵ��
 * @author: ��С��
 * @date: 2020��4��27�� ����9:04:08
 */
public class RandNumUtils {
	
	
	//����1�����ָ����Χ�����С��,����scale��ʾС�����λ��������minΪ25400.56,maxΪ67078.94,����С�����2λ��min��max֮�����������48545.87��8�֣�
	public static Double[] getValue(final double min, final double max,final int scale){
		Double[] result = new Double[scale];
		HashSet<Double> set = new HashSet<Double>();
		while (set.size()!=scale) {
			set.add(randoms(min, max));
		}
		int i = 0;
		for (Double d : set) {
			result[i]=d;
			i++;
		}
		return result;
	//TODO ʵ�ִ���
	}
	
	//����2������min-max֮����������������min�Ͳ�����maxֵ�������緵��1-3֮�����������򷵻�1��2��������������ֵ��8�֣�
	public static int random(int min, int max){
			if(max<=min){
				throw new RuntimeException("��������Ϲ淶������");
			}
			Random r = new Random();
			int i = r.nextInt(max-1+min)+min;
		return i;
		
	}
	//����3������min-max֮������double������min�Ͳ�����maxֵ
		public static Double randoms(Double min, Double max){
				if(max<=min){
					throw new RuntimeException("��������Ϲ淶������");
				}
				Random r = new Random();
				Double i = r.nextDouble()+min;
			return i;
			
		}
}
