package com.cg.fms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.fms.dto.Contract;


public interface ContractDao extends JpaRepository<Contract,String>{
//	public Contract getContract(String contractNumber);
//
//	public boolean addContract(Contract contract);
//
//	public boolean updateContract(Contract contract);
//
//	public boolean deleteContract(String contractNumber);
//	
//	public List<Contract> getAllContracts();
}
