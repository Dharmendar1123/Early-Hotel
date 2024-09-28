package com.early.EarlyHotel.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.early.EarlyHotel.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByEmail(String email);

    Optional<User> findByEmail(String email);
}
