package com.cxf.rest.example.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(value=Include.NON_NULL)
public class SourceDestinationList {

	String message;
	List<String> sources;
	List<String> destination;
	public List<String> getSources() {
		return sources;
	}
	public void setSources(List<String> sources) {
		this.sources = sources;
	}
	public List<String> getDestination() {
		return destination;
	}
	public void setDestination(List<String> destination) {
		this.destination = destination;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
