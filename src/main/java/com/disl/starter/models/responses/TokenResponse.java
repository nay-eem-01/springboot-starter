package com.disl.starter.models.responses;

import com.disl.starter.entities.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TokenResponse {
	private String accessToken;
	private String refreshToken;
	private String tokenType = "Bearer";
	private User user;
	
	public TokenResponse(String accessToken, String refreshToken, User user) {
		super();
		this.accessToken = accessToken;
		this.user = user;
	}

}
