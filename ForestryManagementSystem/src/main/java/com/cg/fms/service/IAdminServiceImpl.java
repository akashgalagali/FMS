package com.cg.fms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.fms.dao.AdminDao;
import com.cg.fms.dto.Admin;
@Service
public class IAdminServiceImpl implements IAdminService {
	@Autowired
	AdminDao adao;
	@Override
	public Optional<Admin> getAdmin(String adminName) {
		return adao.findById(adminName);
	}

	@Override
	public boolean addAdmin(Admin admin) {
		adao.save(admin);
		return false;
	}

	@Override
	public boolean updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		adao.save(admin);
		return false;
	}

	@Override
	public boolean deleteAdmin(String adminName) {
		adao.deleteById(adminName);
		return false;
	}

	@Override
	public List<Admin> getAllAdmins() {
		// TODO Auto-generated method stub
		return adao.findAll();
	}

}
