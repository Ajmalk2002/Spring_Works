package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.HashSet;

import org.hibernate.mapping.Set;

import jakarta.persistence.*;


@Entity
@Table(name= "users")
public class AppUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique=true, nullable=false)
	private String username;
	
	@Column(nullable = false)
	private String password;
	
	private boolean enabled = true;
	
	
	
	

}
