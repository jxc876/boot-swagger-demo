package com.mramirez.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mramirez.model.User;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

@Api(value = "hello")
@Controller
public class HelloController {
		
	@ApiOperation(value = "say hello")
	@RequestMapping(value = "/hello/{id}", method = RequestMethod.GET)
	public @ResponseBody User getHello(@PathVariable("id") int id){
		User user = new User(id, "FirstName", "LastName");
		return user;
	}

}
