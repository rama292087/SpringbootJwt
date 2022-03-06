package com.test.jwtGp.JwtTest.repository;


import com.test.jwtGp.JwtTest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserName(String username);
}
