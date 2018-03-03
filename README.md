# CxfRestWithSpring
Cxf Rest Implementation with Spring Framework

Cxf Xml Configuration:

<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
     	xmlns:cxf="http://cxf.apache.org/core"
		xmlns:jaxws="http://cxf.apache.org/jaxws"
		xmlns:jaxrs="http://cxf.apache.org/jaxrs"
		xsi:schemaLocation="
			http://cxf.apache.org/core http://cxf.apache.org/schemas/core.xsd
			http://www.springframework.org/schema/beans 
			http://www.springframework.org/schema/beans/spring-beans.xsd
			http://cxf.apache.org/jaxrs http://cxf.apache.org/schemas/jaxrs.xsd
			http://cxf.apache.org/jaxws http://cxf.apache.org/schemas/jaxws.xsd">

	<import resource="classpath:META-INF/cxf/cxf.xml"/>
	<import resource="classpath:META-INF/cxf/cxf-servlet.xml"/>
	<!-- @author:Anil Kumar -->
    <cxf:bus>
        <cxf:features>
            <cxf:logging/>
        </cxf:features>
    </cxf:bus>
	<bean id="flightResource" class="com.cxf.rest.example.resource.HindustaniAirwaysResource"/>
	<bean id="jsonProvider" 
		class="com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider"/>
	
  	<jaxrs:server id="hindairwaysrs" address="/rservice">
  		<jaxrs:serviceBeans>
  			<ref bean="flightResource"/>
  		</jaxrs:serviceBeans>
  		<jaxrs:providers>
			<ref bean='jsonProvider' />
		</jaxrs:providers>
  	</jaxrs:server>
</beans>

Execute Resource with postman client
This example demonstrates simple flight details and booking on demand 
There are two resources:
1. Searh Flight Details
	Search flight details is GET resource which will ask source,destination and journey date from user as query parameter.
	This resource will response complete list of flights available for that request parameter.
	
	Endpoint URL:http://localhost:8080/cxfrest/rservice/hindustani-airways/search?source=delhi&destination=bangalore&travel_date=12/03/2018
	
	Response:application/json
				{
				"flightDetails": [
					{
						"flight_id": "HINAIR215123",
						"flight_name": "Hindustani Airways",
						"source": "delhi",
						"destination": "bangalore",
						"travel_date": "12/03/2018",
						"travel_hours": "3:00 HOURS",
						"dep_time": "10:30 Hours",
						"stop": 1,
						"stopage_airport": "Kolkata",
						"stopage_hours": "1:00 HOUR",
						"total_fare": 3445.76
					},
					{
						"flight_id": "HINAIR215125",
						"flight_name": "Hindustani Airways",
						"source": "delhi",
						"destination": "bangalore",
						"travel_date": "12/03/2018",
						"travel_hours": "5:00 HOURS",
						"dep_time": "19:30 Hours",
						"stop": 2,
						"stopage_airport": "Mumbai,Panji",
						"stopage_hours": "2:00 HOUR",
						"total_fare": 5575
					}
				]
				}
2. Booking Flight
	Booking flight is POST request which will ask flight id, travel date and passenger details.
	This resource will response booking details for passenger.
	
	Endpoint:http://localhost:8080/cxfrest/rservice/hindustani-airways/booking/
	Request: application/json
				{
				"flightId":"HINAIR215125",
				"travelDate":"12/03/2018",
				"passengerGovtid":"ADKSK7835M",
				"idType":"PAN"
				}
	Response:application/xml
				<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
				<BookingDetails>
					<arrivalAirport>Kempugowda Internation Airport- Terminal-III</arrivalAirport>
					<boardingTime>19:30 Hours</boardingTime>
					<bookingAmount>5575.0</bookingAmount>
					<depAirport>Indira Gandhi International Airport-Terminal-II</depAirport>
					<destination>Bangalore</destination>
					<flightId>HINAIR215125</flightId>
					<flightName>Hindustani Airways</flightName>
					<govtId>ADKSK7835M</govtId>
					<govtIdType>PAN</govtIdType>
					<journeyDate>12/03/2018</journeyDate>
					<source>Delhi</source>
					<stop>2</stop>
					<stopageAirport>Mumbai,Hydrabad</stopageAirport>
					<stopageHours>2:00 HOUR</stopageHours>
				</BookingDetails>

1. Valid Search Request:<br>
![alt tag](https://github.com/sendkumaranil/CxfRestWithSpring/blob/master/valid_search_request.PNG)
<br>
2. Valid Booking Request
![alt tag](https://github.com/sendkumaranil/CxfRestWithSpring/blob/master/valid_search_request.PNG)
<br>
3. Invalid Search Request -Invalid source/destination
![alt tag](https://github.com/sendkumaranil/CxfRestWithSpring/blob/master/Invalid_search-request_1.PNG)
<br>
4. Invalid Search Request -Same source/destination
![alt tag](https://github.com/sendkumaranil/CxfRestWithSpring/blob/master/Invalid_search-request_2.PNG)
<br>
5. Invalid Booking Request -Invalid Flight Id
![alt tag](https://github.com/sendkumaranil/CxfRestWithSpring/blob/master/Invalid_booking_request.PNG)
<br>
