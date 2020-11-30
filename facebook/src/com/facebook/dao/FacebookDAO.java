package com.facebook.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.facebook.entity.FacebookUser;
import com.facebook.utility.FacebookException;

public class FacebookDAO implements FacebookDAOInterface{
	
	@Override
	public int createProfileDAO(FacebookUser fu)  {
		int i=0;
		Connection con=null;
		try {
			
			if(fu.getName().equals("Rajesh")) {
				throw new FacebookException();
			}
			//Step 1 load driver
		Class.forName("org.postgresql.Driver");
		
		//step 2 connect with database
		con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/capgemini","postgres","rajesh");
		
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
		
		}
		catch(FacebookException fe) {
			fe.printStackTrace();
		}
		
		catch(ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		catch(SQLException e2) {
			e2.printStackTrace();
		}
		
		
		finally {
			try {
				con.close();
			}
			catch(Exception e) {
				
			}
		}
		
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
	public ArrayList<FacebookUser> viewAllProfileDAO() throws Exception {
		
		Class.forName("org.postgresql.Driver");
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/capgemini","postgres","rajesh");
		
		PreparedStatement ps=con.prepareStatement("select * from facebook");
				
		ResultSet res=ps.executeQuery();
		 ArrayList<FacebookUser> f=new ArrayList<FacebookUser>();  //generic collection means specific class object only your bag will accept, it will not accept other class object
		while(res.next()) {
			FacebookUser fb=new FacebookUser();
			fb.setName(res.getString(1));
			fb.setPassword(res.getString(2));
			fb.setEmail(res.getString(3));
			fb.setAddress(res.getString(4));
			
			f.add(fb);
		}
		return f;
	}
	
	public Map<String, Object> getAll(){
		Map<String, Object> m=new HashMap<String, Object>();
		
		ArrayList<String> notif=new ArrayList<String>();
		notif.add("person1 viewed profile");
		notif.add("person2 viewed profile");
		notif.add("person3 viewed profile");
		
		ArrayList<String> flist=new ArrayList<String>();
		flist.add("person1");
		flist.add("person2");
		flist.add("person3");
		
		m.put("notification", notif);
		m.put("friendlist",flist);
		
		return m;
	}

}

















