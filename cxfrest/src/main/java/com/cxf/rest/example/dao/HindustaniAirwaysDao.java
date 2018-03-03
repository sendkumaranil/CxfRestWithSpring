package com.cxf.rest.example.dao;

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
public interface HindustaniAirwaysDao {

	public SearchFlightResponse fetchFlights(String source,String destination,String journeyDate);
	public BookingDetailsResponse bookFlight(BookFlightRequest bookFlightRequest) throws Exception;
}
