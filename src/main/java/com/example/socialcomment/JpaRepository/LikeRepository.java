package com.example.socialcomment.JpaRepository;

import com.example.socialcomment.entity.LikesEntity;
import com.example.socialcomment.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<LikesEntity,Long> {
    Long countByPost(PostEntity postEntity);

}
