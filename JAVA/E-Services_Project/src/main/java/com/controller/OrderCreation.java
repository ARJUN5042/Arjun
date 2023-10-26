package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.*;

import com.model.BookModel;
import com.razorpay.*;
@WebServlet("/OrderCreation")
public class OrderCreation extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int id; 
	int bid;
    public OrderCreation() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RazorpayClient client=null;
		String orderId=null;
		try {
			client=new RazorpayClient("rzp_test_sPhCuuWP15dnn6","ukmAlKMm728ceKiUnbNZBJGI");
			String amount=request.getParameter("amount");
			bid=Integer.parseInt(request.getParameter("bid"));
			Integer digit=new Integer(Integer.parseInt(amount)*100);
			
			JSONObject options=new JSONObject();
			options.put("amount", digit.toString());
			options.put("currency", "INR");
			options.put("receipt", "zxr456");
			options.put("payment_capture", true);
			Order order=client.Orders.create(options);
			orderId=order.get("id");
		} catch (Exception e) {
			e.printStackTrace();
		}
		response.getWriter().append(orderId);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RazorpayClient client=null;
		try {
			client=new RazorpayClient("rzp_test_sPhCuuWP15dnn6","ukmAlKMm728ceKiUnbNZBJGI");
			JSONObject options=new JSONObject();
			options.put("razorpay_payment_id",request.getParameter("razorpay_payment_id"));
			options.put("razorpay_order_id",request.getParameter("razorpay_order_id"));
			options.put("razorpay_signature",request.getParameter("razorpay_signature"));
			boolean SigRes=Utils.verifyPaymentSignature(options,"Secret");
			if(SigRes)
			{
				response.getWriter().append("Payment Successfull");
				Thread.sleep(2000);
			}
			else
			{
				response.getWriter().append("Payment Successfull  1!!!");
				response.sendRedirect("CustomerController?action=succ-pay&bid="+bid);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
