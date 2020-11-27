package com.facebook.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.facebook.entity.FacebookUser;

public class FacebookDAO implements FacebookDAOInterface{
	
	@Override
	public int createProfileDAO(FacebookUser fu) throws Exception {
		int i=0;
		
		//Step 1 load driver
		Class.forName("org.postgresql.Driver");
		
		//step 2 connect with database
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/capgemini","postgres","rajesh");
		
		//step 3 create query
		//Statement for static query
		//PreparedStatement for dynamic query
		PreparedStatement ps=con.prepareStatement("insert into facebook values(?,?,?,?)");
		ps.setString(1, fu.getName());
		ps.setString(2, fu.getPassword());
		ps.setString(3, fu.getEmail());
		ps.setString(4, fu.getAddress());
		
		//step 4 execute query
		//for insert, delete, update use executeUpdate() and return type will be int
		//for select use executeQuery() and return ResultSet
		
		i=ps.executeUpdate();
		
		return i;
	}

	@Override
	public FacebookUser viewProfileDAO(FacebookUser fu) throws Exception {
		
		Class.forName("org.postgresql.Driver");
		
		//step 2 connect with database
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/capgemini","postgres","rajesh");
		
		//step 3 create query
		//Statement for static query
		//PreparedStatement for dynamic query
		PreparedStatement ps=con.prepareStatement("select * from facebook where name=?");
		ps.setString(1, fu.getName());
		
		ResultSet res=ps.executeQuery();
		
		FacebookUser fb=null;
		
		if(res.next()) {
			fb=new FacebookUser();
			fb.setName(res.getString(1));
			fb.setPassword(res.getString(2));
			fb.setEmail(res.getString(3));
			fb.setAddress(res.getString(4));
		}
		return fb;
		
	}

	@Override
	public void deleteProfileDAO() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editProfileDAO() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchProfileDAO() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public FacebookUser[] viewAllProfileDAO() throws Exception {
		FacebookUser[] f=null;
		return f;
		
	}

}

















