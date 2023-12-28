package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.model.Emp;

public class Dao 
{
	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
		
	public int insert(Emp e)
	{
		String sql="insert into emp(name,salary,desg) values('"+e.getName()+"','"+e.getSalary()+"','"+e.getDesg()+"')";
		return jdbcTemplate.update(sql);
	}
	
	public int update(Emp e)
	{
		String sql="update emp set name='"+e.getName()+"',salary='"+e.getSalary()+"',desg='"+e.getDesg()+"' where id='"+e.getId()+"'";
		return jdbcTemplate.update(sql);
	}
	
	public Emp getById(int id)
	{
		String qry="select * from emp where id=?";
		return jdbcTemplate.queryForObject(qry, new Object[] {id}, new BeanPropertyRowMapper<Emp>(Emp.class));
	}
	
	public int delete(int id)
	{
		String qry="delete from emp where id="+id+"";
		return jdbcTemplate.update(qry);
	}
	
	public List<Emp> getAll()
	{
		String qry="select * from emp";
		return jdbcTemplate.query(qry, new RowMapper<Emp>() {
			public Emp mapRow(ResultSet rs, int i) throws SQLException
			{
				Emp e=new Emp();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setSalary(rs.getString(3));
				e.setDesg(rs.getString(4));
				return e;
			}
		});
	}
}
