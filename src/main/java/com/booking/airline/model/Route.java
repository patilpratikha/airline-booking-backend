package com.booking.airline.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Route {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;				// Route iD
	private String source;			// Source city
	private String destination;		// Destination city
	private Float distance;			// Distance between the cities

}
