package com.cxf.rest.example.util;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.apache.cxf.validation.ResponseConstraintViolationException;
import org.springframework.http.HttpStatus;

@Provider
public class ConstraintValidationExcepMapper implements ExceptionMapper<Exception> {

	@Override
	public Response toResponse(Exception exception) {
		Response.Status errorStatus = Response.Status.INTERNAL_SERVER_ERROR;
		ResponseBuilder responseBuilder=Response.status(errorStatus).type(MediaType.APPLICATION_JSON);
        if (exception instanceof ConstraintViolationException) {
            
            final ConstraintViolationException constraint = (ConstraintViolationException) exception;
            
            List<Error> errors=new ArrayList<>();
            for (final ConstraintViolation< ? > violation: constraint.getConstraintViolations()) {
            	 Error error=new Error();
            	 error.setErrorId("400");
            	 error.setErrorMessage(violation.getMessage());
            	 error.setPropertyViolation(violation.getPropertyPath().toString());
            	 error.setRejectedValue(String.valueOf(violation.getInvalidValue()));
            	 error.setHttpStatus(HttpStatus.BAD_REQUEST);
            	 
            	 errors.add(error);
            }
            
            if (!(constraint instanceof ResponseConstraintViolationException)) {
                errorStatus = Response.Status.BAD_REQUEST;
                responseBuilder.status(errorStatus);
            }
            
            responseBuilder.entity(errors);
        } 
        return  responseBuilder.build();
	}

}
