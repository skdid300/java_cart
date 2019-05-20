package com.lkm.oper;

import com.lkm.cart.DataClass;
import com.lkm.cart.ProductClass;

public class OperClass {

	public static void delivery(ProductClass p) {
		if (p.getName().equals("스퀘어 테이블")) {
			if (p.getEa() < 2) {
				p.setDelivery(3000);
			} else if (p.getEa() < 3) {
				p.setDelivery(6000);
			} else if (p.getEa() < 4) {
				p.setDelivery(9000);
			} else {
				p.setDelivery(10000);
			}
		} else if (p.getName().equals("버팔로 외장하드")) {
			if (p.getRealPrice() < 100000) {
				p.setDelivery(2500);
			}
		} else if (p.getName().equals("캐논 DSLR Printer")) {
			if (p.getRealPrice() < 500000) {
				p.setDelivery(2500);
			}
		}

	}

	public static int[] checkOrder(DataClass d) {
		int[] r = new int[d.data.size()];

		for (int i = 0; i < r.length; i++) {
			r[i] = -1; // {-1,-1,-1,-1,-1,-1,-1}
		}
		int idx = 0;
		for (int i = 0; i < d.data.size(); i++) {
			if (d.data.get(i).getOrder().equals("Ok")) {
				r[i] = idx;
				idx++;
			}
		}

		return r; // {0,-1,1,-1,2,3,4}
	}

	public static int[] totalPrice(DataClass d) {

		int[] r1 = new int[4]; // {상품금액, 배송비, 특별할인, 최종결제금액}
		int[] r2 = checkOrder(d); // {0,-1,1,-1,2,3,4}

		for (int i = 0; i < r2.length; i++) {
			delivery(d.data.get(i));
			if (r2[i] > -1) {
				r1[0] += d.data.get(i).getPrice() * d.data.get(i).getEa();
				r1[1] += d.data.get(i).getDelivery();
				r1[2] += d.data.get(i).getSalePrice();
				r1[3] += d.data.get(i).getRealPrice();
			}
		}
		return r1;
	}
}
