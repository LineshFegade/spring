package com.spring.DAO;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.*;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.sql.ResultSet;
import java.sql.SQLException;



import org.springframework.dao.DataAccessException;

import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;


import com.spring.model.Gifts;


@Transactional
@Repository("GiftsDao")
public class GiftsDaoImplimentation implements GiftsDao{
	@Autowired
	private SessionFactory sessionFactory;
	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void addGift(Gifts g) {
		getSession().save(g);	
	}

	@Override
	public int updateGift(int id, int newPrice) {
		Gifts g1=(Gifts) getSession().get(Gifts.class, id);
		g1.setPrice(newPrice);
		getSession().update(g1);
		return newPrice;
		/* 
		 * BookInfo book3=(BookInfo)
		 * session.get(BookInfo.class,code); book3.setBookAuthor(bookAuthor);
		 * session.update(book3); txn.commit(); System.out.println("UPDATED...!!");
		 */
	}

	@Override                   //rowmapper         
	public Gifts deleteGift(int id) {
	Gifts gift=(Gifts) getSession().get(Gifts.class, id);
	getSession().delete(gift);
	return gift;
	}

	@Override  
	public List<Gifts> getAllGifts() {
		Query sql=getSession().createQuery("from Gifts g");	
		List<Gifts> giftList=sql.list();
		Iterator<Gifts> itr=giftList.iterator();
		while(itr.hasNext()) {
			Gifts g=itr.next();
			System.out.println(g);
		}
		return giftList;

	}

	@Override
	public List<Gifts> getGiftByCategory(String category) {
		Query sql=getSession().createQuery("from Gifts g where g.category = ?");
		sql.setParameter(0,category );
		List<Gifts> glist=sql.list();
		Iterator<Gifts> itr=glist.iterator();
		while(itr.hasNext()) {
			Gifts g=itr.next();
			System.out.println(g);
		}
		return glist;
	}

	@Override		
	public Gifts getGiftInfo(int id) {
		Query sql=getSession().createQuery("from Gifts g where g.giftId=?");
		sql.setParameter(0, id);
		 Gifts g=(Gifts) sql.list();
		 Iterator<Gifts> itr=((List<Gifts>) g).iterator();
			while(itr.hasNext()) {
				Gifts gt=itr.next();
				System.out.println(gt);
			}
		return g;
	}

	
	
	  @Override
	  public List<String> getCategories()
	  {
		  Query  sql=getSession().createQuery("select distinct category from Gifts g"); 
		  List<String> gi= sql.list();
		  return gi ; 
	  }
	 
	 

}
