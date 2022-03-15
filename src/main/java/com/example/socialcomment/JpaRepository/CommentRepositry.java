package com.example.socialcomment.JpaRepository;

import com.example.socialcomment.entity.CommentEnity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepositry extends JpaRepository<CommentEnity,Long> {

}
