package com.lkm.oper;


public class PrintClass{
	
	public static void prn(int a){
		System.out.println(a);
	}
	public static void prn(String s){
		System.out.println(s);
	}

	public static void prn(int[] a){
		for(int i=0; i<a.length;i++){
			System.out.print(a[i] + "\t");
		}		
	}
	
}
