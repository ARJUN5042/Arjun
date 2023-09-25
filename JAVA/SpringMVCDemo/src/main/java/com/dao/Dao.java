package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.model.Employee;

public class Dao 
{
	JdbcTemplate jt;

	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	
	public int add(Employee p)
	{
		String sql="insert into employee(name,salary,desg) values('"+p.getName()+"','"+p.getSalary()+"','"+p.getDesg()+"')";
		return jt.update(sql);
	}
	
	public int updateemployee(Employee p)
	{
		String sql="update employee set name='"+p.getName()+"',salary='"+p.getSalary()+"',desg='"+p.getDesg()+"' where id='"+p.getId()+"'";
		return jt.update(sql);
	}
	
	public int deleteemployee(int id)
	{
		String sql="delete from employee where id='"+id+"'";
		return jt.update(sql);
	}
	
	public Employee getEmpById(int id)
	{
		String sql="select * from employee where id=?";
		return jt.queryForObject(sql, new Object[] {id},new BeanPropertyRowMapper<Employee>(Employee.class));
	}
	
	public List<Employee> getEmployees()
	{
		return jt.query("select * from employee", new RowMapper<Employee>() {
			public Employee mapRow(ResultSet rs, int row) throws SQLException
			{
				Employee e =new Employee();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setSalary(rs.getString(3));
				e.setDesg(rs.getString(4));
				return e;
			}
		});
	}
}
