package com.autenticacion.ejercicio.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.autenticacion.ejercicio.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	Optional<User> findByUsername(String username);
}
