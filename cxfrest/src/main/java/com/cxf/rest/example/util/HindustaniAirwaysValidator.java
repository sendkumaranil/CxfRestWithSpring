package com.cxf.rest.example.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.cxf.rest.example.model.SourceDestinationList;
/**
 * 
 * @author Anil Kumar
 *
 */
@Component
public class HindustaniAirwaysValidator {

	private static Set<String> source;
	private static Set<String> destination;
	
	static {
		source=new HashSet<>();
		destination=new HashSet<>();
		
		source.add("DELHI");
		source.add("KOLKATA");
		source.add("MUMBAI");
		source.add("PUNE");
		source.add("BANGALORE");
		source.add("HYDRABAD");
				
		destination.add("DELHI");
		destination.add("KOLKATA");
		destination.add("MUMBAI");
		destination.add("PUNE");
		destination.add("BANGALORE");
		destination.add("HYDRABAD");
		
	}
	
	public SourceDestinationList validateSourceDestination(String sourceReq,String destinationReq) {
		
		SourceDestinationList destinationList=null;
		
		if(sourceReq.equalsIgnoreCase(destinationReq)) {
			destinationList=new SourceDestinationList();
			destinationList.setMessage("Source and Destination can not be same");
			return destinationList;
		}else if(source.contains(sourceReq.toUpperCase()) 
				&& destination.contains(destinationReq.toUpperCase())) {
			return null;
		}else {
			destinationList=new SourceDestinationList();
			
			List<String> sources=new ArrayList<>(source);
			List<String> destinations=new ArrayList<>(destination);
			
			destinationList.setSources(sources);
			destinationList.setDestination(destinations);
			destinationList.setMessage("Invalid Source or Destination!!Please check the list");
			
			return destinationList;
		}		
	}
}
