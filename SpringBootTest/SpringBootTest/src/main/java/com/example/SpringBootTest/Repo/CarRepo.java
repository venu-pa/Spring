package com.example.SpringBootTest.Repo;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBootTest.Entity.Car;

public interface CarRepo  extends JpaRepository<Car, Id> {

}
