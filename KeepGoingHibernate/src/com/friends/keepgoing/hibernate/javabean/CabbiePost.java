package com.friends.keepgoing.hibernate.javabean;

import java.sql.Time;
import java.util.Date;

public class CabbiePost {
	
	public CabbiePost()
	{
		
	}

	   public CabbiePost(String user_name, String departure, String destination,
			Date departure_date, Time departure_time, Date arrival_date,
			Time arrival_time, Date posted_date_time, int seat_capacity,
			String vehicle_name, String vehicle_no, String driver_license,
			int cost,  String post_status, String occurance_type,
			String description) {
		
		this.user_name = user_name;
		this.departure = departure;
		this.destination = destination;
		this.departure_date = departure_date;
		this.departure_time = departure_time;
		this.arrival_date = arrival_date;
		this.arrival_time = arrival_time;
		this.posted_date_time = posted_date_time;
		this.seat_capacity = seat_capacity;
		this.vehicle_name = vehicle_name;
		this.vehicle_no = vehicle_no;
		this.driver_license = driver_license;
		this.cost = cost;
		this.post_status = post_status;
		this.occurance_type = occurance_type;
		this.description = description;
	}
	
	
    public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Date getDeparture_date() {
		return departure_date;
	}
	public void setDeparture_date(Date departure_date) {
		this.departure_date = departure_date;
	}
	public Date getDeparture_time() {
		return departure_time;
	}
	public void setDeparture_time(Time departure_time) {
		this.departure_time = departure_time;
	}
	public Date getArrival_date() {
		return arrival_date;
	}
	public void setArrival_date(Date arrival_date) {
		this.arrival_date = arrival_date;
	}
	public Date getArrival_time() {
		return arrival_time;
	}
	public void setArrival_time(Time arrival_time) {
		this.arrival_time = arrival_time;
	}
	public Date getPosted_date_time() {
		return posted_date_time;
	}
	public void setPosted_date_time(Date posted_date_time) {
		this.posted_date_time = posted_date_time;
	}
	public int getSeat_capacity() {
		return seat_capacity;
	}
	public void setSeat_capacity(int seat_capacity) {
		this.seat_capacity = seat_capacity;
	}
	public String getVehicle_name() {
		return vehicle_name;
	}
	public void setVehicle_name(String vehicle_name) {
		this.vehicle_name = vehicle_name;
	}
	public String getVehicle_no() {
		return vehicle_no;
	}
	public void setVehicle_no(String vehicle_no) {
		this.vehicle_no = vehicle_no;
	}
	public String getDriver_license() {
		return driver_license;
	}
	public void setDriver_license(String driver_license) {
		this.driver_license = driver_license;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getPost_no() {
		return post_no;
	}
	public void setPost_no(int post_no) {
		this.post_no = post_no;
	}
	public String getPost_status() {
		return post_status;
	}
	public void setPost_status(String post_status) {
		this.post_status = post_status;
	}
	public String getOccurance_type() {
		return occurance_type;
	}
	public void setOccurance_type(String occurance_type) {
		this.occurance_type = occurance_type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
		   private String user_name;
		   private String departure; 
		   private String destination;
		   private Date departure_date;
		   private Time departure_time;
		   private Date arrival_date;
		   private Time arrival_time;
		   private Date posted_date_time;
		   private int seat_capacity;
		   private String vehicle_name;
		   private String vehicle_no;
		   private String driver_license;
		   private int cost;
		   private int post_no;
		   private String post_status;
		   private String occurance_type;
		   private String description;


		   		
}
