package com.valid.app.user.exception;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Error Info
 * 
 * @author Roxana Andrea Jaramillo Cobos
 */
public class ErrorInfo {

	@JsonProperty("message")
	private String message;
	@JsonProperty("status_code")
	private int statusCode;
	@JsonProperty("uri")
	private String uriRequested;

	public ErrorInfo(int statusCode, String message, String uriRequested) {
		this.message = message;
		this.statusCode = statusCode;
		this.uriRequested = uriRequested;
	}

	public String getMessage() {
		return message;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public String getUriRequested() {
		return uriRequested;
	}

}