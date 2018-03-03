package com.cxf.rest.example.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(value=Include.NON_NULL)
public class SearchFlightResponse {

	List<SearchFlightDetails> flightDetails;

	public List<SearchFlightDetails> getFlightDetails() {
		return flightDetails;
	}

	public void setFlightDetails(List<SearchFlightDetails> flightDetails) {
		this.flightDetails = flightDetails;
	}	
}
