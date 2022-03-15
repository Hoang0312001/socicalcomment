package com.example.socialcomment.service;

import com.example.socialcomment.dto.LikeDTO;
import com.example.socialcomment.dto.ShareDTO;

public interface ILikeService {
    LikeDTO insert(LikeDTO likeDTO, Long postId, Long userId);
    LikeDTO delete(Long id);
    Long countLikePost(Long idpost);
}
