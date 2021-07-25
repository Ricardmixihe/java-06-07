package com.jizhong.pojo;
/**
 * 自定义泛型类
 * 	类指定泛型：类名<T>
 */
public class Generics<T> {
	private T arg;//String Integer ....
	
	public Generics(T arg) {
		super();
		this.arg = arg;
	}

	public void show(T arg){
		System.out.println(arg);
	}
}
