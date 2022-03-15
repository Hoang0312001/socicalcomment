package com.example.socialcomment.service.impl;

import com.example.socialcomment.JpaRepository.PostRepository;
import com.example.socialcomment.JpaRepository.ShareRepository;
import com.example.socialcomment.JpaRepository.UserRepository;
import com.example.socialcomment.dto.ShareDTO;
import com.example.socialcomment.entity.PostEntity;
import com.example.socialcomment.entity.ShareEntity;
import com.example.socialcomment.mapper.ShareMapper;
import com.example.socialcomment.service.IShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ShareService implements IShareService {
    @Autowired
    private ShareRepository shareRepository;
    @Autowired
    private ShareMapper shareMapper;
    @Autowired
    private PostRepository postRepository;
    @Autowired
    private UserRepository userRepository;


    @Override
    public ShareDTO insert(ShareDTO shareDTO,Long postId,Long userId) {
        ShareEntity shareEntity = new ShareEntity();
        shareEntity = shareMapper.to(shareDTO);
        shareEntity.setUser(userRepository.getById(userId));
        shareEntity.setPost(postRepository.getById(postId));
        shareEntity = shareRepository.save(shareEntity);
        return shareMapper.from(shareEntity);
    }

    @Override
    public ShareDTO delete(Long id) {
       shareRepository.deleteById(id);
        return null;
    }
}
