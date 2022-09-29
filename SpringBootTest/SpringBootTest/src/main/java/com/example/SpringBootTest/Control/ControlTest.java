package com.example.SpringBootTest.Control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootTest.Entity.Car;
import com.example.SpringBootTest.Repo.CarRepo;

@RestController
@ComponentScan
@RequestMapping("/path")
public class ControlTest {
	@Autowired
	CarRepo repo;
	
	@PatchMapping("/move")
	public Integer value() {
		System.out.println("invalid");
		return 234;
		}

	
	@GetMapping("/go")
	public int name() {
		System.out.println("honda");
		return 123;
	}
	
	@DeleteMapping("/lost")
	public String area() {
		System.out.println("pla");
		return "hill";
	}
	
	@PatchMapping("/done")
	public ResponseEntity<Object> SaveDetails(@RequestBody Car car){
		Car c=repo.save(car);
		return new ResponseEntity<Object>(c,HttpStatus.ALREADY_REPORTED);
		
	}

}
