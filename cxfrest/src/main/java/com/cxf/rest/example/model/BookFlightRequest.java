package com.cxf.rest.example.model;

public class BookFlightRequest {

	 private String flightId;
	 private String travelDate;
	 private String passengerGovtid;	
	 private String idType;
	
		
	public String getFlightId() {
		return flightId;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	public String getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(String travelDate) {
		this.travelDate = travelDate;
	}
	public String getPassengerGovtid() {
		return passengerGovtid;
	}
	public void setPassengerGovtid(String passengerGovtid) {
		this.passengerGovtid = passengerGovtid;
	}
	public String getIdType() {
		return idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}
}
