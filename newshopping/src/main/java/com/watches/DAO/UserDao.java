package com.watches.DAO;

import java.util.List;

import com.watches.model.User;
import com.watches.model.UserDetails;



public interface UserDao{


	public List<User> list();

	public User get(String id);

	public void saveOrUpdate(User user);
	
	public void saveOrUpdate(UserDetails userDetails);

	public void delete(String id);
	
	public boolean isValidUser(String id, String name, boolean isAdmin);


}
