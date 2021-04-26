package com.cxf.rest.example.util;

import javax.validation.Path;

import org.springframework.http.HttpStatus;

public class Error {

	private String errorId;
	private String errorMessage;
	private HttpStatus httpStatus;
	private String propertyViolation;
	private String rejectedValue;
	
	public String getErrorId() {
		return errorId;
	}
	public void setErrorId(String errorId) {
		this.errorId = errorId;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}
	public String getPropertyViolation() {
		return propertyViolation;
	}
	public void setPropertyViolation(String path) {
		this.propertyViolation = path;
	}
	public String getRejectedValue() {
		return rejectedValue;
	}
	public void setRejectedValue(String rejectedValue) {
		this.rejectedValue = rejectedValue;
	}
	
	
	
}
