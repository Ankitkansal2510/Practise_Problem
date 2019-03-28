package com.ankit.Array_Problems;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		list.add(0);
		list.add(10);
		list.add(5);
		list.add(20);
		System.out.println(list);
		
		List<Integer> list1=list.stream().filter(i->i%2!=0).collect(Collectors.toList());
		List<Integer> list2=list.stream().map(i->i*2).collect(Collectors.toList());
		OptionalDouble list5=list.stream().mapToInt(i->i).average();
		List<Integer> list3=list.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
		Long count=list.stream().filter(i->i%2==0).count();
		OptionalInt min=list.stream().mapToInt(v->v).min();
		int minValue=list.stream().min((i1,i2)->i1.compareTo(i2)).get();
		Integer[] array=list.stream().toArray(Integer[]::new);//Copying elements of list into array
		System.out.println(list1);
		System.out.println(list2 + " " + count + " " +min);
		System.out.println(list3 + " MinValue is : " + minValue + " Average : " + list5.getAsDouble());

		for(Integer i:array)
		{
			System.out.println(i);
		}
	}

}
