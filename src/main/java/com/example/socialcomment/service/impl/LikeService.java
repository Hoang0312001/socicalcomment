package com.example.socialcomment.service.impl;

import com.example.socialcomment.JpaRepository.LikeRepository;
import com.example.socialcomment.JpaRepository.PostRepository;
import com.example.socialcomment.JpaRepository.UserRepository;
import com.example.socialcomment.dto.LikeDTO;
import com.example.socialcomment.entity.LikesEntity;
import com.example.socialcomment.entity.PostEntity;
import com.example.socialcomment.mapper.LikeMapper;
import com.example.socialcomment.service.ILikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class LikeService implements ILikeService {
    @Autowired
    private LikeRepository likeRepository;
    @Autowired
    private LikeMapper likeMapper;
    @Autowired
    private PostRepository postRepository;
    @Autowired
    private UserRepository userRepository;
    @Override
    public LikeDTO insert(LikeDTO likeDTO, Long postId, Long userId) {
        LikesEntity likesEntity = new LikesEntity();
        likesEntity = likeMapper.to(likeDTO);
        likesEntity.setUser(userRepository.getById(userId));
        likesEntity.setPost(postRepository.getById(postId));
        likesEntity = likeRepository.save(likesEntity);
        return likeMapper.from(likesEntity);
    }

    @Override
    public LikeDTO delete(Long id) {
        likeRepository.deleteById(id);
        return null;
    }

    @Override
    public Long countLikePost(Long idpost) {
        PostEntity post = postRepository.findOneById(idpost);
        return likeRepository.countByPost(post);
    }
}
