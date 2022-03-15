package com.example.socialcomment.mapper;

import com.example.socialcomment.dto.CommentDTO;

import java.util.List;

public interface Mapper <S,D>{
    S to (D obj);
    D from(S obj);
    List<S> to (List<D> obj);
    List<D> from(List<S> obj);
}
