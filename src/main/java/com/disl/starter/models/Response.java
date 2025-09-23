package com.disl.starter.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Getter
@Setter
@NoArgsConstructor
public class Response {

	private HttpStatus status;
	private String message;
	private Object payload;
	private boolean success;

	public static ResponseEntity<Response> getResponseEntity(boolean success, String message, Object payload) {
		return new ResponseEntity<>(new Response(success ? HttpStatus.OK : HttpStatus.BAD_REQUEST, success, message, payload), success ? HttpStatus.OK : HttpStatus.BAD_REQUEST);
	}

	public static ResponseEntity<Response> getResponseEntity(boolean success, String message) {
		return new ResponseEntity<>(new Response(success ? HttpStatus.OK : HttpStatus.BAD_REQUEST, success, message, null), success ? HttpStatus.OK : HttpStatus.BAD_REQUEST);
	}

	public static ResponseEntity<Response> getResponseEntity(HttpStatus httpStatus, String message, Object payload) {
		return new ResponseEntity<>(new Response(httpStatus, httpStatus.equals(HttpStatus.OK), message, payload), httpStatus);
	}

	public static ResponseEntity<Response> getResponseEntity(HttpStatus httpStatus, String message) {
		return new ResponseEntity<>(new Response(httpStatus, httpStatus.equals(HttpStatus.OK), message, null), httpStatus);
	}


	public Response(HttpStatus status, boolean success, String message, Object payload) {
		super();
		this.status = status;
		this.success = success;
		this.message = message;
		this.payload = payload;
	}

	public Response(HttpStatus status, boolean success, String message) {
		super();
		this.status = status;
		this.success = success;
		this.message = message;
	}

}
