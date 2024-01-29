package com.ssafy.cadang.repository;

import com.ssafy.cadang.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    public User findByUserEmail(String userEmail);

    public User findByUserId(Long userId);
}
