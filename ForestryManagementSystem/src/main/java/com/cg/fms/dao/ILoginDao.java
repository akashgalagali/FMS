package com.cg.fms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.fms.dto.User;

public interface ILoginDao extends JpaRepository<User,String>{
//	public User login(String username,String password);
//	public User logout(User user);
//	public User addUser(User user);
//	public User removeUser(User user);
}
