package com.lishaojie.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.lsj.common.utils.DateUtils;

public class TpsTest {

	@Test
	public void test() {
		//ѭ��100��
		for (int i = 1; i <=100; i++) {
			//ѭ����������
			Tps t = new Tps();
			//id����
			t.setId(i);
			//ר����������ֵ����ZHStringUtil��getZHName()
			t.setName(StringUtils.getZHName());
			//��������ֵ����RandomUtil.random()������������1-100��֮��
			t.setAge(RandNumUtils.random(1, 100));
			//н����3��8��С�����2λ�������
			t.setPrice(RandNumUtils.randoms(30000.00, 80000.00));
			//Ƹ����������ֵģ��2012��1��1�������������ʱ��
			Calendar c = Calendar.getInstance();
			c.set(2012, 1, 1);
			Date date = DateUtils.random(c.getTime(), new Date());
			SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd");
			t.setUseDate(fm.format(date));
			System.out.println(t);
		}
	}

}
