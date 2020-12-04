package com.spring.DAO;

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

@Repository("GiftsDao")
public class GiftsDaoImplimentation implements GiftsDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int addGift(Gifts g) {
		String sql="insert into spr_gifts values(?,?,?,?)";
		int r= jdbcTemplate.update(sql, new Object[]{g.getGiftId(),g.getGiftName(),g.getCategory(),g.getPrice()});
		return r;
	}

	@Override
	public int updateGift(int id, int newPrice) {
		String sql="update spr_gifts set price=? where id=?";
		int r=jdbcTemplate.update(sql, new Object[] {newPrice,id});
		return r;
	}

	@Override                   //rowmapper         
	public int deleteGift(int id) {
		String sql="delete from spr_gifts where id=?";
		int r =jdbcTemplate.update(sql, new Object[] {id});
		return r;
	}

	@Override  
	public List<Gifts> getAllGifts() {
		String sql="select * from spr_gifts";
		List<Gifts> bookList=jdbcTemplate.query(sql,new RowMapper<Gifts>(){

			@Override
			public Gifts mapRow(ResultSet rs, int rownum)
					throws SQLException {
				// How to fetch data from ResultSet into the Book object
				Gifts gf=new Gifts();
				gf.setGiftId(rs.getInt(1));
				gf.setGiftName(rs.getString(2));
				gf.setCategory(rs.getString(3));
				gf.setPrice(rs.getInt(4));
				return gf;
			}		
		});	
		return bookList;
	}

	@Override
	public List<Gifts> getGiftByCategory(String category) {
		String sql="select * from spr_gifts where category=?";
		List<Gifts> categoryList=jdbcTemplate.query(sql,new Object[] {category},new RowMapper<Gifts>() {

			@Override
			public Gifts mapRow(ResultSet rs, int rowNum) throws SQLException {
				Gifts g=new Gifts();
				g.setGiftId(rs.getInt(1));
				g.setGiftName(rs.getString(2));
				g.setCategory(rs.getString(3));
				g.setPrice(rs.getInt(4));
				
				return g;
			}
		
		});
		return categoryList;
	}

	@Override		//resultSetExtractor
	public Gifts getGiftInfo(int id) {
		String sql="select * from spr_gifts where id=?";
		
		return jdbcTemplate.query(sql, new Object[]{id },new ResultSetExtractor<Gifts>() {

			@Override
			public Gifts extractData(ResultSet rs) throws SQLException, DataAccessException {
				Gifts g=new Gifts();
				if(rs.next()) {
					g.setGiftId(rs.getInt(1));
					g.setGiftName(rs.getString(2));
					g.setCategory(rs.getString(3));
					g.setPrice(rs.getInt(4));
				}
				return g;
			}
		});
	}

	
	
	  @Override public List getCategories()
	  {
		  String  sql="select distinct category from spr_gifts"; 
		  return jdbcTemplate.query(sql, new ResultSetExtractor<List<String>>() {

			@Override
			public List<String> extractData(ResultSet rs) throws SQLException, DataAccessException {
				ArrayList<String> ar = new	ArrayList<>();
				while(rs.next()) {
					ar.add(rs.getString("category"));
				}
				return ar;
			}
		});
		
	  }
	 
	 

}
