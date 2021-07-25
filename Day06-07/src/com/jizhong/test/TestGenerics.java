package com.jizhong.test;

import java.util.ArrayList;
import java.util.List;

import com.jizhong.pojo.Generics;
import com.jizhong.pojo.Generics2;
import com.jizhong.pojo.GennricsGlobbing;

public class TestGenerics {
	public static void main(String[] args) {
		//测试自定义泛型类
//		Generics<Integer> gen = new Generics<>(132456789);
//		gen.show();
		
		//测试泛型方法
		Generics2 gen = new Generics2();
		gen.show("String");
		
		List<?> list = new ArrayList<String>();
	}
}
