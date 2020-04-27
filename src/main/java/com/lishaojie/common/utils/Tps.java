package com.lishaojie.common.utils;
/**
 * 
 * @ClassName: Tps 
 * @Description: TPS实体类
 * @author: 敷小衍
 * @date: 2020年4月27日 上午9:01:45
 */
public class Tps {

	private Integer id;//编号
	private String name;//专家姓名
	private Integer age;//年龄
	private Double price;//薪酬
	private String useDate;//聘用日期
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
		return "id=" + id + ", 专家姓名=" + name + ", 年龄=" + age + ", 薪酬="
				+ price + ", 聘用日期=" + useDate;
	}
	
}
