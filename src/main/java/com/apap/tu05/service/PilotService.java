package com.apap.tu05.service;

import com.apap.tu05.model.PilotModel;
/*
 * 
 * Pilot Service
 * 
 */

public interface PilotService {
	
	PilotModel getPilotDetailByLicenseNumber(String licenseNumber);
	PilotModel getPilotDetailByID(Long id);
	
	void addPilot(PilotModel pilot);
	void deletePilot(PilotModel pilot);
}