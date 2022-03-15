package com.example.socialcomment.service;

import com.example.socialcomment.dto.ShareDTO;

public interface IShareService {
    ShareDTO insert(ShareDTO shareDTO,Long postId,Long userId);
    ShareDTO delete(Long id);
}
