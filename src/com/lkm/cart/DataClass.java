package com.lkm.cart;

import java.util.ArrayList;

public class DataClass {
	public ArrayList<ProductClass> data = new ArrayList<ProductClass>();

	public DataClass() {
		data.add(new ProductClass("������ ���̺�", 2, 49000, 7350, "Ok"));
		data.add(new ProductClass("�ö�ƽ ����", 3, 14180, 0));
		data.add(new ProductClass("���ȷ� �����ϵ�", 2, 84900, 0, "Ok"));
		data.add(new ProductClass("�Ƿ�����", 1, 16000, 2000));
		data.add(new ProductClass("������ 2TB", 3, 138850, 8770, "Ok"));
		data.add(new ProductClass("�޸� ����", 2, 49800, 2000, "Ok"));
		data.add(new ProductClass("ĳ�� DSLR Printer", 3, 257000, 15420, "Ok"));
	}

}
