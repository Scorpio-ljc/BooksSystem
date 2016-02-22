package com.ljc.uitl;

import java.util.LinkedList;
import java.util.Vector;

//划分二维数组,得到链表集合

public class DivideArrays {
	//要划分的集合及划分的份数
	public static Vector divide(Object[][] obj,int count){
		LinkedList linkedList=new LinkedList();
		Vector vector=new Vector();
		int allrow=obj.length;
		int getRow=allrow/count;
		Object[][] obj1={{""}};
		Object[][] obj2={{""}};
		int a=0;
		int count1=0;
		for(int i=0;i<obj.length;i++){
			int b=0;
			if(i/18==count-1){
				a=0;
				//obj1=null;
				System.out.println("OK");
				obj2=new Object[allrow-i][];
			}else if(i%18==0){
				//obj1=null;
				a=0;
				obj1=new String[18][];
			}
			for(int j=0;j<obj[i].length;j++){
				//最后一个数组的长度
				obj1[a]=new String[]{
						(String)obj[i][0],
						(String)obj[i][1],
						(String)obj[i][2],
						(String)obj[i][3],
						(String)obj[i][4]
				};
			}
			a++;
			if(i%17==0&&i!=0||i==obj.length-1){
				if(i==obj.length-1){
					vector.add(obj2);
				}else{
					boolean temp=vector.add(obj1);
				}
				count1++;
			}
		}
		return vector;
	}
}
