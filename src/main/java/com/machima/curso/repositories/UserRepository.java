package com.machima.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.machima.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
