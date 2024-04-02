package com.autenticacion.ejercicio.http;

import com.autenticacion.ejercicio.entities.Role;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
	String username;
	String password;
	String firstname;
	String lastname;
	String country;
	Role role;
}
