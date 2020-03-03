package com.apap.tu05.service;


import com.apap.tu05.model.FlightModel;


/*
 * 
 * FlightService
 */

public interface FlightService {
	
	void addFlight(FlightModel flight);
	void deleteFlight(FlightModel flight);
	FlightModel getFlightByID(long id);
	
}