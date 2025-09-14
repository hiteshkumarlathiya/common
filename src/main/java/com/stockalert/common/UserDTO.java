package com.stockalert.common;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String userId;
	
	private String name;
	
	private String email;
	
	private String mobileno;

}