package com.alesjdev.movierating.dao;

import com.alesjdev.movierating.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Integer> {

    @Query("SELECT u FROM User u WHERE u.email = ?1")
    public User findByEmail(String email);

    @Query("SELECT u FROM User u WHERE u.username = ?1")
    public User findByUsername(String username);
}
