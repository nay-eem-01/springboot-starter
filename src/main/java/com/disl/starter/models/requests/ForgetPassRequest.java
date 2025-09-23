package com.disl.starter.models.requests;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ForgetPassRequest {
	String pass1;
	String pass2;
	String token;
	
}
