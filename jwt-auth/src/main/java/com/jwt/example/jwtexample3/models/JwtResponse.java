package com.jwt.example.jwtexample3.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class JwtResponse {
	
	private String jwtToken;
	private String username;
	public static Object builder() {
		// TODO Auto-generated method stub
		return null;
	}

}
