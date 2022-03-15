package com.example.socialcomment.mapper;

import com.example.socialcomment.dto.LikeDTO;
import com.example.socialcomment.dto.ShareDTO;
import com.example.socialcomment.entity.LikesEntity;
import com.example.socialcomment.entity.ShareEntity;
@org.mapstruct.Mapper(componentModel = "spring")
public interface LikeMapper extends Mapper<LikesEntity, LikeDTO>{
}
