package com.cg.fms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.fms.dto.Scheduler;

public interface ISchedulerDao extends JpaRepository<Scheduler,String>{
//	public Scheduler getScheduler(String schedulerId);
//
//	public boolean addScheduler(Scheduler scheduler);
//
//	public boolean updateScheduler(Scheduler scheduler);
//
//	public boolean deleteScheduler(String schedulerId);
//	
//	public List<Scheduler> getAllSchedulers();
}
