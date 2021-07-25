package com.jizhong.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.jizhong.pojo.CollectionGenerics;

public class CollectionGenericsTest {
	public static void main(String[] args) {
		//测试有界泛型类
		//T必须是Collection接口的实现类，或者子类
		CollectionGenerics<List<String>> c1 = new CollectionGenerics<>();
//		List<String> list = new ArrayList<String>();
//		list.add("a");
//		list.add("b");
//		list.add("c");
//		c1.show(set);
		
//		CollectionGenerics<Set<String>> c2 = new CollectionGenerics<>();
//		Set<String> set  = new HashSet<>();
//		set.add("a");
//		set.add("b");
//		set.add("c");
//		c2.show(set);
		
		CollectionGenerics<Collection<String>> c2 = new CollectionGenerics<>();
		Set<String> set  = new HashSet<>();
		set.add("a");
		set.add("b");
		set.add("c");
		c2.show(set);
	}
}
