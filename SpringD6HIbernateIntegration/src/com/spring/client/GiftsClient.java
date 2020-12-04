package com.spring.client;


import java.util.List;
import java.util.Scanner;

import org.hibernate.Hibernate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.DAO.GiftsDao;
import com.spring.configuration.HibernateConfiguration;

import com.spring.model.Gifts;


public class GiftsClient {
@SuppressWarnings({ "unused", "resource", "unchecked" })
public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(HibernateConfiguration.class);
	GiftsDao giftDao=(GiftsDao) context.getBean("GiftsDao");
	
	Gifts gifts=new Gifts();
	int giftId,price;
	int res;
	Gifts res1;
	String giftName,category;
	List<Gifts> giftlist;
	List<String> garlist;

	Scanner sc=new Scanner(System.in);
	do {
		System.out.println("#### MENU ####\n1.add Gift\n2.Update gift \n3.Delete Gift \n4.show all Gifts \n5.Show gift by category \n6.show perticular gift\n7.show all Categories");
		System.out.println("Enter Your Choice :-");
		int ch=sc.nextInt();
		
		switch (ch) {
		case 1:
			System.out.println("Enter Gift ID :-");
			giftId=sc.nextInt();
			System.out.println("Enter Gift Name :-");
			giftName=sc.next();
			System.out.println("Enter Gift Category :-");
			category=sc.next();
			System.out.println("Enter Gift Price :-");
			price=sc.nextInt();
			giftDao.addGift(new Gifts(giftId,giftName,category,price));
			System.out.println(".........Gift ADDED...........");
			break;
		case 2:
			System.out.println("Enter Gift Id :-");
			giftId=sc.nextInt();
			System.out.println("Enter Gift New Price :-");
			price=sc.nextInt();
		
			giftDao.updateGift(giftId, price);
			System.out.println(".......GIFT PRICE UPDATED.......");
			break;
			
		case 3:
			System.out.println("Enter Gift Id to be Delete :-");
			giftId=sc.nextInt();
			res1=giftDao.deleteGift(giftId);
			System.out.println("........GIFT DELETED.......");
			break;
		case 4:
			giftlist=giftDao.getAllGifts();
			for(Gifts g1:giftlist) {
				System.out.println(g1);
			}
			break;
		case 5:
			System.out.println("Enter Category :-");
			category=sc.next();
			giftlist=giftDao.getGiftByCategory(category);
			for(Gifts g2:giftlist) {
				System.out.println(g2);
			}
			break;
			
		case 6:
			System.out.println("Enter Gift Id :-");
			giftId=sc.nextInt();
			gifts =giftDao.getGiftInfo(giftId);
			System.out.println(gifts);
			break;
			
		case 7:
			garlist=giftDao.getCategories();
			for(String g2:garlist) {
				System.out.println(g2);
			}
			break;
		default:
			System.out.println("Sorry...Wrong Choice...!!!!");
			break;
		}
	}while(true);
}
}
