package com.lkm.cart;

import java.util.ArrayList;

public class DataClass {
	public ArrayList<ProductClass> data = new ArrayList<ProductClass>();

	public DataClass() {
		data.add(new ProductClass("스퀘어 테이블", 2, 49000, 7350, "Ok"));
		data.add(new ProductClass("플라스틱 의자", 3, 14180, 0));
		data.add(new ProductClass("버팔로 외장하드", 2, 84900, 0, "Ok"));
		data.add(new ProductClass("또래오래", 1, 16000, 2000));
		data.add(new ProductClass("엠지텍 2TB", 3, 138850, 8770, "Ok"));
		data.add(new ProductClass("메모렛 엣지", 2, 49800, 2000, "Ok"));
		data.add(new ProductClass("캐논 DSLR Printer", 3, 257000, 15420, "Ok"));
	}

}
