package com.disl.starter.models.requests;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignUpRequest {

	private String email;
	private String password;
    private String name;
}
