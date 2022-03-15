package com.example.socialcomment.JpaRepository;

import com.example.socialcomment.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PostRepository extends JpaRepository<PostEntity,Long> {
   Optional<PostEntity> findById(Long id);
   PostEntity findOneById(Long id);


}
