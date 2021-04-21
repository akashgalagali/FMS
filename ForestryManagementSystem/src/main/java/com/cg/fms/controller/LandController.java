package com.cg.fms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.fms.dto.Land;
import com.cg.fms.service.LandServiceImpl;

@RestController
@RequestMapping("/land")
public class LandController {
	@Autowired
	LandServiceImpl landservice= new LandServiceImpl();
	
	public LandServiceImpl getLandService() {
		return landservice;
	}

	public void setLandService(LandServiceImpl landservice) {
		this.landservice = landservice;
	}
	@GetMapping(value="/all",produces="application/json")
	public ResponseEntity<List<Land>> getAllLands(){
		System.out.println("it worked");
		return new ResponseEntity<List<Land>>(landservice.getAllLands(),HttpStatus.OK);
	}
	@GetMapping(value="/{survey_no}",produces="application/json")
	public Optional<Land> getLand(@PathVariable("survey_no")String surveyno){
		Optional<Land> l=null; 
		l=landservice.getLand(surveyno);
		System.out.println(l.toString());
		return l;
	}
	@PostMapping(consumes="application/json")
	public ResponseEntity<HttpStatus> addLand(@RequestBody Land land) {
		landservice.addLand(land);
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
	@PutMapping(consumes="application/json")
	public ResponseEntity<HttpStatus> updateLand(@RequestBody Land land) {
		landservice.updateLand(land);
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
	@DeleteMapping(value="/{contract_no}")
	public ResponseEntity<HttpStatus> deleteLand(@PathVariable("survey_no")String surveyno){
		landservice.removeLandDetails(surveyno);
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
}
