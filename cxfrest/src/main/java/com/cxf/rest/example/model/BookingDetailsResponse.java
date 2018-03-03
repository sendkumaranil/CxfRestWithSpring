package com.cxf.rest.example.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="BookingDetails")
public class BookingDetailsResponse {
	
	private String bookingId;
	
	private BigDecimal bookingAmount;
	
	private String govtId;
	
	private String govtIdType;
	
	private String journeyDate;
	
	private String source;
	
	private String destination;
	
	private String depAirport;
	
	private String arrivalAirport;
	
	private String boardingTime;
	
	private String flightId;
	
	private String flightName;
	
	private String travelHours;
	
	private int stop;
	
	private String stopageAirport;
	
	private String stopageHours;
	
	public String getBookingId() {
		return bookingId;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
	public BigDecimal getBookingAmount() {
		return bookingAmount;
	}
	public void setBookingAmount(BigDecimal bookingAmount) {
		this.bookingAmount = bookingAmount;
	}
	public String getGovtId() {
		return govtId;
	}
	public void setGovtId(String govtId) {
		this.govtId = govtId;
	}
	public String getGovtIdType() {
		return govtIdType;
	}
	public void setGovtIdType(String govtIdType) {
		this.govtIdType = govtIdType;
	}
	public String getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(String journeyDate) {
		this.journeyDate = journeyDate;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDepAirport() {
		return depAirport;
	}
	public void setDepAirport(String depAirport) {
		this.depAirport = depAirport;
	}
	public String getArrivalAirport() {
		return arrivalAirport;
	}
	public void setArrivalAirport(String arrivalAirport) {
		this.arrivalAirport = arrivalAirport;
	}
	public String getBoardingTime() {
		return boardingTime;
	}
	public void setBoardingTime(String boardingTime) {
		this.boardingTime = boardingTime;
	}
	public String getFlightId() {
		return flightId;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getTravelHours() {
		return travelHours;
	}
	public void setTravelHours(String travelHours) {
		this.travelHours = travelHours;
	}
	public int getStop() {
		return stop;
	}
	public void setStop(int stop) {
		this.stop = stop;
	}
	public String getStopageAirport() {
		return stopageAirport;
	}
	public void setStopageAirport(String stopageAirport) {
		this.stopageAirport = stopageAirport;
	}
	public String getStopageHours() {
		return stopageHours;
	}
	public void setStopageHours(String stopageHours) {
		this.stopageHours = stopageHours;
	}
	
}
