package com.spring.model;

public class Gifts {
	
	private int giftId;
	private String giftName;
	private String category;
	private int price;
	public Gifts() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Gifts(int giftId, String giftName, String category, int price) {
		super();
		this.giftId = giftId;
		this.giftName = giftName;
		this.category = category;
		this.price = price;
	}
	public int getGiftId() {
		return giftId;
	}
	public void setGiftId(int giftId) {
		this.giftId = giftId;
	}
	public String getGiftName() {
		return giftName;
	}
	public void setGiftName(String giftName) {
		this.giftName = giftName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Gifts [giftId=" + giftId + ", giftName=" + giftName + ", category=" + category + ", price=" + price
				+ "]";
	}
	
}
