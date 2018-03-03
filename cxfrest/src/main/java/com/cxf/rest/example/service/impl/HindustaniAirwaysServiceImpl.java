package com.cxf.rest.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cxf.rest.example.dao.HindustaniAirwaysDao;
import com.cxf.rest.example.model.BookFlightRequest;
import com.cxf.rest.example.model.BookingDetailsResponse;
import com.cxf.rest.example.model.SearchFlightResponse;
import com.cxf.rest.example.service.HindustaniAirwaysService;

/**
 * 
 * @author Anil Kumar
 *
 */
@Service
public class HindustaniAirwaysServiceImpl implements HindustaniAirwaysService {

	@Autowired
	private HindustaniAirwaysDao dao;
	
	@Override
	public SearchFlightResponse searchFlights(String source, String destination, String journeyDate) {
		return dao.fetchFlights(source, destination, journeyDate);
	}

	@Override
	public BookingDetailsResponse bookFlight(BookFlightRequest bookFlightRequest) throws Exception {
		return dao.bookFlight(bookFlightRequest);
	}

}
