package com.example.socialcomment.mapper;

import com.example.socialcomment.dto.ShareDTO;
import com.example.socialcomment.entity.ShareEntity;

@org.mapstruct.Mapper(componentModel = "spring")
public interface ShareMapper extends Mapper<ShareEntity, ShareDTO> {
}
