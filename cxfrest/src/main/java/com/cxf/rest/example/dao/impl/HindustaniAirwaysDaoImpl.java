package com.cxf.rest.example.dao.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cxf.rest.example.dao.HindustaniAirwaysDao;
import com.cxf.rest.example.model.BookFlightRequest;
import com.cxf.rest.example.model.BookingDetailsResponse;
import com.cxf.rest.example.model.SearchFlightDetails;
import com.cxf.rest.example.model.SearchFlightResponse;
/**
 * 
 * @author Anil Kumar
 *
 */
@Repository
public class HindustaniAirwaysDaoImpl implements HindustaniAirwaysDao {

	@Override
	public SearchFlightResponse fetchFlights(String source, String destination, String journeyDate) {
		SearchFlightResponse response =new SearchFlightResponse();
		List<SearchFlightDetails> flightDetails=new ArrayList<>();
		
		SearchFlightDetails flight1=new SearchFlightDetails();
		flight1.setFlightId("HINAIR215123");
		flight1.setFlightName("Hindustani Airways");
		flight1.setSource(source);
		flight1.setDestination(destination);
		flight1.setTravelDate(journeyDate);
		BigDecimal totalFare=BigDecimal.valueOf(3445.76);
		flight1.setTotalFare(totalFare);
		flight1.setDepTime("10:30 Hours");
		flight1.setStop(1);
		flight1.setStopageAirport("Kolkata");
		flight1.setTravelHours("3:00 HOURS");
		flight1.setStopageHours("1:00 HOUR");
		
		SearchFlightDetails flight2=new SearchFlightDetails();
		flight2.setFlightId("HINAIR215125");
		flight2.setFlightName("Hindustani Airways");
		flight2.setSource(source);
		flight2.setDestination(destination);
		flight2.setTravelDate(journeyDate);
		BigDecimal totalFare2=BigDecimal.valueOf(5575.00);
		flight2.setTotalFare(totalFare2);
		flight2.setDepTime("19:30 Hours");
		flight2.setStop(2);
		flight2.setStopageAirport("Mumbai,Panji");
		flight2.setTravelHours("5:00 HOURS");
		flight2.setStopageHours("2:00 HOUR");
		
		flightDetails.add(flight1);
		flightDetails.add(flight2);
		response.setFlightDetails(flightDetails);
		return response;
	}

	@Override
	public BookingDetailsResponse bookFlight(BookFlightRequest bookFlightRequest) throws Exception {
		BookingDetailsResponse bookingDetailsResponse=new BookingDetailsResponse();
		
		SearchFlightDetails flightDetails=getFlightDetails(bookFlightRequest.getFlightId());
		
		bookingDetailsResponse.setSource(flightDetails.getSource());
		bookingDetailsResponse.setDestination(flightDetails.getDestination());
		bookingDetailsResponse.setJourneyDate(flightDetails.getTravelDate());
		bookingDetailsResponse.setBoardingTime(flightDetails.getDepTime());
		bookingDetailsResponse.setDepAirport("Indira Gandhi International Airport-Terminal-II");
		bookingDetailsResponse.setArrivalAirport("Kempugowda Internation Airport- Terminal-III");
		bookingDetailsResponse.setGovtId(bookFlightRequest.getPassengerGovtid());
		bookingDetailsResponse.setGovtIdType(bookFlightRequest.getIdType());
		bookingDetailsResponse.setBookingAmount(flightDetails.getTotalFare());
		bookingDetailsResponse.setFlightId(bookFlightRequest.getFlightId());
		bookingDetailsResponse.setFlightName(flightDetails.getFlightName());
		bookingDetailsResponse.setStop(flightDetails.getStop());
		bookingDetailsResponse.setStopageAirport(flightDetails.getStopageAirport());
		bookingDetailsResponse.setStopageHours(flightDetails.getStopageHours());
		
		return bookingDetailsResponse;
	}

	private SearchFlightDetails getFlightDetails(String flightId) throws Exception {
		SearchFlightDetails flight1=new SearchFlightDetails();
		flight1.setFlightId("HINAIR215123");
		flight1.setFlightName("Hindustani Airways");
		flight1.setSource("Delhi");
		flight1.setDestination("Bangalore");
		flight1.setTravelDate("12/03/2018");
		BigDecimal totalFare1=BigDecimal.valueOf(3445.76);
		flight1.setTotalFare(totalFare1);
		flight1.setDepTime("10:30 Hours");
		flight1.setStop(1);
		flight1.setStopageAirport("Kolkata");
		flight1.setTravelHours("3:00 HOURS");
		flight1.setStopageHours("1:00 HOUR");
		
		SearchFlightDetails flight2=new SearchFlightDetails();
		flight2.setFlightId("HINAIR215125");
		flight2.setFlightName("Hindustani Airways");
		flight2.setSource("Delhi");
		flight2.setDestination("Bangalore");
		flight2.setTravelDate("12/03/2018");
		BigDecimal totalFare2=BigDecimal.valueOf(5575.00);
		flight2.setTotalFare(totalFare2);
		flight2.setDepTime("19:30 Hours");
		flight2.setStop(2);
		flight2.setStopageAirport("Mumbai,Hydrabad");
		flight2.setTravelHours("5:00 HOURS");
		flight2.setStopageHours("2:00 HOUR");
		
		if("HINAIR215123".equalsIgnoreCase(flightId)) {
			return flight1;
		}else if("HINAIR215125".equalsIgnoreCase(flightId)){
			return flight2;
		}else {
			throw new Exception("Invalid Flight Request");
		}
	}

}
