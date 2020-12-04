package com.spring.DAO;

import java.util.List;

import com.spring.model.Gifts;

public interface GiftsDao {
	
	public int addGift(Gifts g);
	public int updateGift(int id,int newPrice);
	public int deleteGift(int id);
	public List<Gifts> getAllGifts();
	public List<Gifts> getGiftByCategory(String category);
	public Gifts getGiftInfo(int id);
	public List getCategories(); 
}
