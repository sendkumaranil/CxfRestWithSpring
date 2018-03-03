package com.cxf.rest.example.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonPropertyOrder({
	"flight_id","flight_name","source","destination","travel_date","travel_hours",
	"dep_time","dep_time","stop","stopage_airport","stopage_hours","total_fare"
})
@JsonInclude(value=Include.NON_NULL)
public class SearchFlightDetails {


	@JsonProperty("flight_id")
	private String flightId;
	@JsonProperty("flight_name")
	private String flightName;
	@JsonProperty("total_fare")
	private BigDecimal totalFare;
	@JsonProperty("source")
	private String source;
	@JsonProperty("destination")
	private String destination;
	@JsonProperty("travel_date")
	private String travelDate;
	@JsonProperty("dep_time")
	private String depTime;
	@JsonProperty("travel_hours")
	private String travelHours;
	@JsonProperty("stop")
	private int stop=0;
	@JsonProperty("stopage_airport")
	private String stopageAirport;
	@JsonProperty("stopage_hours")
	private String stopageHours;
	
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
	public BigDecimal getTotalFare() {
		return totalFare;
	}
	public void setTotalFare(BigDecimal totalFare) {
		this.totalFare = totalFare;
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
	public String getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(String travelDate) {
		this.travelDate = travelDate;
	}
	public String getDepTime() {
		return depTime;
	}
	public void setDepTime(String depTime) {
		this.depTime = depTime;
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
