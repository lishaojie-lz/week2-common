package com.lishaojie.common.utils;
/**
 * 
 * @ClassName: Tps 
 * @Description: TPSʵ����
 * @author: ��С��
 * @date: 2020��4��27�� ����9:01:45
 */
public class Tps {

	private Integer id;//���
	private String name;//ר������
	private Integer age;//����
	private Double price;//н��
	private String useDate;//Ƹ������
	public Tps() {
		super();
	}
	public Tps(Integer id, String name, Integer age, Double price,
			String useDate) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.price = price;
		this.useDate = useDate;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getUseDate() {
		return useDate;
	}
	public void setUseDate(String useDate) {
		this.useDate = useDate;
	}
	@Override
	public String toString() {
		return "id=" + id + ", ר������=" + name + ", ����=" + age + ", н��="
				+ price + ", Ƹ������=" + useDate;
	}
	
}
