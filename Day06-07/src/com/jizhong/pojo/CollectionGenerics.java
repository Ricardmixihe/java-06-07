package com.jizhong.pojo;

import java.util.Collection;
import java.util.Iterator;
/**
 * 有界泛型：类名<T extends Parent>
 * 		T必须是Parent接口(类)的实现类，或者子类，或者Parent接口(类)本身
 */
public class CollectionGenerics<T extends Collection> {
	
	//遍历集合，查看集合中数据
	public void show(T list){
		Iterator it = list.iterator();//获取迭代器，遍历集合
		//判断当前数组中是否还有数据
		while(it.hasNext()){
			//获取数据，打印数据
			System.out.println(it.next());
		}
	}
}
