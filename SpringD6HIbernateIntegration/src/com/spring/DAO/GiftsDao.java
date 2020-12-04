package com.spring.DAO;

import java.util.List;

import com.spring.model.Gifts;

public interface GiftsDao {
	
	public void addGift(Gifts g);
	public int updateGift(int id,int newPrice);
	public Gifts deleteGift(int id);
	public List<Gifts> getAllGifts();
	public List<Gifts> getGiftByCategory(String category);
	public Gifts getGiftInfo(int id);
	public List getCategories(); 
}
