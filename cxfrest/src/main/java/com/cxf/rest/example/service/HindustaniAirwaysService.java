package com.cxf.rest.example.service;

import org.springframework.stereotype.Component;

import com.cxf.rest.example.model.BookFlightRequest;
import com.cxf.rest.example.model.BookingDetailsResponse;
import com.cxf.rest.example.model.SearchFlightResponse;
/**
 * 
 * @author Anil Kumar
 *
 */
@Component
public interface HindustaniAirwaysService {

	public SearchFlightResponse searchFlights(String source,String destination,String journeyDate);
	public BookingDetailsResponse bookFlight(BookFlightRequest bookFlightRequest) throws Exception;
}
