package com.disl.starter.models.requests;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChangePasswordRequest {
	
	private String email;
	private String previousPassword;
	private String newPassword;

}
