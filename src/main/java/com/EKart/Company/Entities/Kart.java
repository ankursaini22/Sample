package com.EKart.Company.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Kart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int kartId;

}
