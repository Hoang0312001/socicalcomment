package com.example.socialcomment.service;

import com.example.socialcomment.dto.CommentDTO;

import java.util.List;

public interface ICommentService {
    List<CommentDTO> getAll();
    CommentDTO save(CommentDTO commentDTO,Long userId,Long postId);
    CommentDTO update(Long id, CommentDTO commentDTO);
    CommentDTO delete(Long id);

}
