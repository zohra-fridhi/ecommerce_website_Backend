package com.register.pjt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.register.pjt.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	Optional<User> findByUsername(String name);

}