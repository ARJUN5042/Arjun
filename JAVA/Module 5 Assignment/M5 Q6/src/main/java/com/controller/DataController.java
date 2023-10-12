package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.HBDao;
import com.model.Cart;
import com.model.Item;

@WebServlet("/DataController")
public class DataController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DataController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String action=request.getParameter("action");
		if(action.equals("showitem"))
		{
			int cartId=Integer.parseInt(request.getParameter("cartId"));
			Cart cart=new HBDao().showCart(cartId);
			request.setAttribute("cart", cart);
			request.getRequestDispatcher("show.jsp").forward(request, response);
			
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Cart cart=new Cart();
		cart.setName(request.getParameter("name"));
		cart.setTotal(Double.parseDouble(request.getParameter("total")));
		
		Item item=new Item();
		item.setItemName(request.getParameter("itemName"));
		item.setQuantity(Integer.parseInt(request.getParameter("quantity")));
		item.setItemTotal(Double.parseDouble(request.getParameter("itemTotal")));
		item.setCart(cart);
		
		String msg=new HBDao().addCart(cart);
		String msg1=new HBDao().addItem(item);
		
		if(!msg.equals("error") && !msg1.equals("error"))
		{
			request.setAttribute("msg", msg);
			request.getRequestDispatcher("DataController?action=showitem&itemId="+item.getId()+"%cartId="+cart.getCartId()).forward(request, response);
		}
		else
		{
			request.setAttribute("msg", "Insert Again");
			request.getRequestDispatcher("cart.jsp").forward(request, response);
		}
	}

}
