package com.example.socialcomment.service.impl;

import com.example.socialcomment.JpaRepository.CommentRepositry;
import com.example.socialcomment.JpaRepository.PostRepository;
import com.example.socialcomment.JpaRepository.UserRepository;
import com.example.socialcomment.dto.CommentDTO;
import com.example.socialcomment.entity.CommentEnity;
import com.example.socialcomment.mapper.CommentMapper;
import com.example.socialcomment.service.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommentService implements ICommentService {
    @Autowired
    private CommentRepositry commentRepositry;
    @Autowired
    private CommentMapper commentMapper;
    @Autowired
    private PostRepository postRepository;
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<CommentDTO> getAll() {
        List<CommentDTO> list = new ArrayList<>();
        List<CommentEnity> enityList = commentRepositry.findAll();
        for (CommentEnity enity : enityList){
            CommentDTO commentDTO = commentMapper.from(enity);
            list.add(commentDTO);

        }
        return list;
    }

    @Override
    public CommentDTO save(CommentDTO commentDTO,Long postId,Long userId) {
        CommentEnity commentEnity = new CommentEnity();
        commentEnity = commentMapper.to(commentDTO);
        commentEnity.setPost(postRepository.getById(postId));
        commentEnity.setUserComment(userRepository.getById(userId));
        commentEnity = commentRepositry.save(commentEnity);
        return  commentMapper.from(commentEnity);
    }

    @Override
    public CommentDTO update(Long id, CommentDTO commentDTO) {
        CommentEnity commentEnity = commentMapper.to(commentDTO);
        commentEnity.setId(id);
        commentRepositry.save(commentEnity);
        return commentDTO;
    }

    @Override
    public CommentDTO delete(Long id) {

            commentRepositry.deleteById(id);

        return null;
    }
}
