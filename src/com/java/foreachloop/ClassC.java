package com.java.foreachloop;

import java.util.Arrays;
import java.util.List;

public class ClassC {
	
	public static void main (String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		list.forEach(k->System.out.println(k));
	}
	
}
