package com.jizhong.pojo;

public class Reflection {
	private String name;//成员变量
	private String age;
	
	
	public Reflection() {//无参构造方法
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Reflection(String name) {//有参构造方法
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Reflection [name=" + name + ", age=" + age + "]";
	}
}
