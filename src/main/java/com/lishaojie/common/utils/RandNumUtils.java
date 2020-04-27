package com.lishaojie.common.utils;

import java.util.HashSet;
import java.util.Random;

/**
 * 
 * @ClassName: RandNumUtils 
 * @Description: 随机数值类
 * @author: 敷小衍
 * @date: 2020年4月27日 上午9:04:08
 */
public class RandNumUtils {
	
	
	//方法1：获得指定范围的随机小数,精度scale表示小数点后位数，举例min为25400.56,max为67078.94,返回小数点后2位的min和max之间的数，比如48545.87（8分）
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
	//TODO 实现代码
	}
	
	//方法2：返回min-max之间的随机整数（包含min和不包含max值），例如返回1-3之间的随机数，则返回1或2，不能是其他数值（8分）
	public static int random(int min, int max){
			if(max<=min){
				throw new RuntimeException("请输入符合规范的数字");
			}
			Random r = new Random();
			int i = r.nextInt(max-1+min)+min;
		return i;
		
	}
	//方法3：返回min-max之间的随机double（包含min和不包含max值
		public static Double randoms(Double min, Double max){
				if(max<=min){
					throw new RuntimeException("请输入符合规范的数字");
				}
				Random r = new Random();
				Double i = r.nextDouble()+min;
			return i;
			
		}
}
