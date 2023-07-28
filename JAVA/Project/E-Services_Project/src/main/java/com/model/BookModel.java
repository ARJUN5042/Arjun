package com.model;

public class BookModel 
{
	private int bid,subid,customerid;
	private String bdate,price,bstatus,pstatus;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public int getSubid() {
		return subid;
	}
	public void setSubid(int subid) {
		this.subid = subid;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getBdate() {
		return bdate;
	}
	public void setBdate(String bdate) {
		this.bdate = bdate;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getBstatus() {
		return bstatus;
	}
	public void setBstatus(String bstatus) {
		this.bstatus = bstatus;
	}
	public String getPstatus() {
		return pstatus;
	}
	public void setPstatus(String pstatus) {
		this.pstatus = pstatus;
	}
	
}
