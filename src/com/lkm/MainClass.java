package com.lkm;

import com.lkm.cart.DataClass;
import com.lkm.oper.OperClass;
import com.lkm.oper.PrintClass;

public class MainClass {

	public static void main(String[] args) {
		DataClass dc = new DataClass();
		
		int[] result = OperClass.totalPrice(dc);
		PrintClass.prn(result);
	}

}
