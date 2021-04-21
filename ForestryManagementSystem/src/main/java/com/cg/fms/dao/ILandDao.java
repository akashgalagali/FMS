package com.cg.fms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.fms.dto.Land;


public interface ILandDao extends JpaRepository<Land,String>{
//	public Land getLand(String surveyNumber);
//
//	public boolean addLand(Land land);
//
//	public boolean updateLand(Land land);
//
//	public boolean deleteLand(String surveyNumber);
//	
//	public List<Land> getAllLands();
}
