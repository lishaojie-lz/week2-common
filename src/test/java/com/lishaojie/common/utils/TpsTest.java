package com.lishaojie.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.lsj.common.utils.DateUtils;

public class TpsTest {

	@Test
	public void test() {
		//循环100次
		for (int i = 1; i <=100; i++) {
			//循环创建对象
			Tps t = new Tps();
			//id属性
			t.setId(i);
			//专家姓名属性值调用ZHStringUtil的getZHName()
			t.setName(StringUtils.getZHName());
			//年龄属性值调用RandomUtil.random()创建，必须在1-100岁之间
			t.setAge(RandNumUtils.random(1, 100));
			//薪酬是3万到8万，小数点后2位的随机数
			t.setPrice(RandNumUtils.randoms(30000.00, 80000.00));
			//聘用日期属性值模拟2012年1月1日至今任意随机时间
			Calendar c = Calendar.getInstance();
			c.set(2012, 1, 1);
			Date date = DateUtils.random(c.getTime(), new Date());
			SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd");
			t.setUseDate(fm.format(date));
			System.out.println(t);
		}
	}

}
