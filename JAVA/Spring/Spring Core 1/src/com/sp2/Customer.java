package com.sp2;

import java.util.List;
import java.util.Set;

public class Customer 
{
	List<Object> lists;
	Set<Object> sets;
	public void setLists(List<Object> lists) {
		this.lists = lists;
	}
	public void setSets(Set<Object> sets) {
		this.sets = sets;
	}
	public List<Object> getLists() {
		return lists;
	}
	public Set<Object> getSets() {
		return sets;
	}
	
}
