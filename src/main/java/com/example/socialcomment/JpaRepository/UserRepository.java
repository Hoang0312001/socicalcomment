package com.example.socialcomment.JpaRepository;

import com.example.socialcomment.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
}
