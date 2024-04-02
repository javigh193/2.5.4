package com.autenticacion.ejercicio.controllers;

import java.util.HashMap;

import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PostFilter;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class DemoController {
	
		@PostMapping(value = "demo")
		public String welcome() {
			return "Welcome all from secure endpoint";
		}
		
		@PostMapping("/helloAdmin")
		@PreAuthorize("hasAnyRole('ADMIN')")
		public String welcomeAdmin() {
			return "Welcome admin form secure endpoint";
		}
		
		@PostMapping("/helloUser")
		@PreAuthorize("hasAnyRole('USER')")
		public String welcomUser() {
			return "Welcome user form secure endpoint";
		}
		
		@DeleteMapping("/dropDB")
		public String dropDB() {
			return "Crimen cometido con éxito";
		}
		
		@DeleteMapping("/deleteUser")
		public String deleteUser() {
			return "Se ha borrado un usuario";
		}
		
		@GetMapping("/secretMessage")
		@PostAuthorize("returnObject == authentication.name")
		public String secretMessage() {
			return "paula@gmail.com";
		}
}
