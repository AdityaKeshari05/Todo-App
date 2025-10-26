package com.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Models.AppUser;

import java.util.Optional;

public interface UserRepository extends JpaRepository<AppUser , Long> {
    Optional<AppUser> findByUserName(String userName);
}
