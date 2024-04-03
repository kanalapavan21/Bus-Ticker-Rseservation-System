package com.springrestapi.BusReservation.BusEntity;

import java.sql.Date;
import java.sql.Time;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="BUSTRIPS")
public class BusTrip {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="TRIPID")
	private int tripid;
	
	@Column(name="DepartureCity",nullable=false)
	private String departureCIty;
	
	@Column(name="DepatureDate",nullable=false)
	private Date departureDate;
	
	@Column(name="DepartureTime",nullable=false)
	private Time departureTime;
	
	@Column(name="ArrivalCity",nullable=false)
	private String arrivalCity;
	
	@Column(name="ArrivalDate",nullable=false)
	private Date arrivalDate;
	
	@Column(name="ArrivalTime",nullable=false)
	private Time arrivalTime;
	
	@Column(name="AvailableSeats",nullable=false)
	private int availableSeats;
	
	@Column(name="BusType",nullable=false)
	private String busType;
	
	@Column(name="TripCost",nullable=false)
	private float tripCost;
	
	
	
	public BusTrip() {
		super();
	}



	public BusTrip(int tripid, String departureCIty, Date departureDate, Time departureTime, String arrivalCity,
			Date arrivalDate, Time arrivalTime, int availableSeats, String busType, float tripCost) {
		super();
		this.tripid = tripid;
		this.departureCIty = departureCIty;
		this.departureDate = departureDate;
		this.departureTime = departureTime;
		this.arrivalCity = arrivalCity;
		this.arrivalDate = arrivalDate;
		this.arrivalTime = arrivalTime;
		this.availableSeats = availableSeats;
		this.busType = busType;
		this.tripCost = tripCost;
	}



	public int getTripid() {
		return tripid;
	}



	public void setTripid(int tripid) {
		this.tripid = tripid;
	}



	public String getDepartureCIty() {
		return departureCIty;
	}



	public void setDepartureCIty(String departureCIty) {
		this.departureCIty = departureCIty;
	}



	public Date getDepartureDate() {
		return departureDate;
	}



	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}



	public Time getDepartureTime() {
		return departureTime;
	}



	public void setDepartureTime(Time departureTime) {
		this.departureTime = departureTime;
	}



	public String getArrivalCity() {
		return arrivalCity;
	}



	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}



	public Date getArrivalDate() {
		return arrivalDate;
	}



	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}



	public Time getArrivalTime() {
		return arrivalTime;
	}



	public void setArrivalTime(Time arrivalTime) {
		this.arrivalTime = arrivalTime;
	}


	@JsonIgnore
	public int getAvailableSeats() {
		return availableSeats;
	}



	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}



	public String getBusType() {
		return busType;
	}



	public void setBusType(String busType) {
		this.busType = busType;
	}



	public float getTripCost() {
		return tripCost;
	}



	public void setTripCost(float tripCost) {
		this.tripCost = tripCost;
	}



	
	
	
	
	

}
