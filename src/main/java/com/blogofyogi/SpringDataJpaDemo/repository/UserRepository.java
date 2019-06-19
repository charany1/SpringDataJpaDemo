package com.blogofyogi.SpringDataJpaDemo.repository;

import com.blogofyogi.SpringDataJpaDemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
