package com.ljc.uitl;

import java.util.LinkedList;

public class Demo1 {
	public static void main(String[] args) {
//		System.out.println(1%18);
//		String[][] str={{"1"}};
////		str=new String[3][];
////		str[0][0]="11";
//		String[][] str1=new String[3][];
//		str1[0]=new String[]{"11"};
//		System.out.println(str1[0][0]);
//		//System.out.println(str1[0][2]);
		LinkedList linkedList=new LinkedList();
		String[][] str1={{"aaa"},{"bbb"}};
		String[][] str2={{"ccc"},{"ddd"}};
		linkedList.add(str1);
		linkedList.add(str2);
		String[][] str=(String[][])linkedList.getFirst();
		System.out.println(str[1][0]);
	}
}
