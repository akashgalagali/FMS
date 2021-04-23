package com.cg.fms.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.fms.dto.Admin;

public interface AdminDao extends JpaRepository<Admin,String>{
	
//	public Admin getAdmin(String adminName);
//
//	public boolean addAdmin(Admin admin);
//	
//	public boolean updateAdmin(Admin admin);
//
//	public boolean deleteAdmin(String adminName);
//	
//	public List<Admin> getAllAdmins();
}
