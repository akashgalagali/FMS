package com.cg.fms.service;

import java.util.List;
import java.util.Optional;

import com.cg.fms.dto.Admin;
public interface IAdminService {

	public Optional<Admin> getAdmin(String adminName);

	public boolean addAdmin(Admin admin);
	
	public boolean updateAdmin(Admin admin);

	public boolean deleteAdmin(String adminName);

	public List<Admin> getAllAdmins();
	
}
