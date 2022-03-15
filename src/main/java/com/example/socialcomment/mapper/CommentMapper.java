package com.example.socialcomment.mapper;

import com.example.socialcomment.dto.CommentDTO;
import com.example.socialcomment.entity.CommentEnity;

@org.mapstruct.Mapper(componentModel = "spring")
public interface CommentMapper extends Mapper<CommentEnity,CommentDTO> {
}
