package com.cg.fms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.fms.dto.User;
import com.cg.fms.service.ILoginServiceImpl;


@RestController
@RequestMapping("/login")
public class LoginController {
@Autowired
ILoginServiceImpl loginService=null;
public ILoginServiceImpl getLoginService() {
	return loginService;
}

public void setLoginService(ILoginServiceImpl loginervice) {
	this.loginService = loginervice;
}
@GetMapping(value="/{username}/{password}",produces="application/json")
public ResponseEntity<Optional<User>> validateLogin(@PathVariable("username")String username,@PathVariable("password")String password){
	System.out.println("it worked");
	return new ResponseEntity<Optional<User>>(loginService.login(username,password),HttpStatus.OK);
}

}
