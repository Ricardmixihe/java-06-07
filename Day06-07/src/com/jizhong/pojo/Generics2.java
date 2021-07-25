package com.jizhong.pojo;
/**
 * 自定义泛型类
 * 	方法指定泛型：<T> void show(T arg)：传递参数是什么类型，那么<T>泛型就是什么类型
 */
public class Generics2 {

	public <T> void show(T arg){
		System.out.println(arg);
	}
}
