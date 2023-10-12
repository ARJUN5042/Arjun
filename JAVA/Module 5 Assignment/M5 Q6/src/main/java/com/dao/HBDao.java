package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Cart;
import com.model.Item;
import com.util.HBUtil;

public class HBDao 
{
	Cart cart=null;
	Item item=null;
	Session session=null;
	Transaction tx=null;
	String msg="";
	String msg1="";
	
	public String addCart(Cart cart)
	{
		try
		{
			session=new HBUtil().getSessionData();
			tx=session.beginTransaction();
			session.save(cart);
			tx.commit();
			session.close();
			msg="Cart added Successfully...";
		}
		catch(Exception e)
		{
			msg="error";
			e.printStackTrace();
		}
		return msg;
	}
	public String addItem(Item item)
	{
		try
		{
			session=new HBUtil().getSessionData();
			tx=session.beginTransaction();
			session.save(item);
			tx.commit();
			session.close();
			msg1="Item added Successfully...";
		}
		catch(Exception e)
		{
			msg1="error";
			e.printStackTrace();
		}
		return msg1;
	}
		
	public Cart showCart(int cartId)
	{
		try
		{
			session=new HBUtil().getSessionData();
			tx=session.beginTransaction();
			Query q=session.createQuery("from Cart c where c.cartId=:cartId");
			q.setParameter("cartId", cartId);
			List<Cart> lists=q.list();
			cart=lists.get(0);
			tx.commit();
			session.close();
		}
		catch(Exception e)
		{
			cart=null;
			e.printStackTrace();
		}
		return cart;
	}
	public Item showItem(int id)
	{
		try 
		{
			session=new HBUtil().getSessionData();
			tx=session.beginTransaction();
			Query q=session.createQuery("from Item i where i.id=:id");
			q.setParameter("id", id);
			List<Item> lists=q.list();
			item=lists.get(0);
			tx.commit();
			session.close();
		}
		catch(Exception e)
		{
			item=null;
			e.printStackTrace();
		}
		return item;
	}
}
