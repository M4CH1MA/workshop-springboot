package com.machima.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.machima.curso.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> FindAll(){
		User u = new User(1L, "Jonathan", "jonathandallavecchia23@gmail.com", "45999988888", "1234");
		return ResponseEntity.ok().body(u);
	}
}
