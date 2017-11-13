package com.tianbiaoge.example.fanruidemo;

import com.tianbiaoge.example.fanruidemo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
