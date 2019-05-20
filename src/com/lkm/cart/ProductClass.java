package com.lkm.cart;

public class ProductClass {
	private String name=null;
	private int ea = 0;
	private int price =0;
	private int salePrice = 0;
	private int realPrice = 0;
	private int delivery = 0;
	private String order = null;
	
	public ProductClass(String n, int e, int p, int sp){
		this(n, e, p, sp, "");
	}

	public ProductClass(String n, int e, int p, int sp, String o) {
		this.name = n;
		this.ea = e;
		this.price = p;
		this.salePrice = sp;
		this.order = o;
		this.setRealPrice(realPrice(this));
	}
	private int realPrice(ProductClass p){
		return (p.price*p.ea)-p.salePrice;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEa() {
		return ea;
	}

	public void setEa(int ea) {
		this.ea = ea;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(int salePrice) {
		this.salePrice = salePrice;
	}

	public int getDelivery() {
		return delivery;
	}

	public void setDelivery(int delivery) {
		this.delivery = delivery;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public int getRealPrice() {
		return realPrice;
	}

	public void setRealPrice(int realPrice) {
		this.realPrice = realPrice;
	}

}
