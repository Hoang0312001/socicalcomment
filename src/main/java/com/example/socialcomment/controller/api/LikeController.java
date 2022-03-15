package com.example.socialcomment.controller.api;

import com.example.socialcomment.dto.LikeDTO;
import com.example.socialcomment.service.ILikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LikeController {
    @Autowired
    private ILikeService iLikeService;
    @PostMapping("/like/{postId}/{userId}")
    public LikeDTO createLike(@RequestBody LikeDTO likeDTO, @PathVariable("postId") Long postId, @PathVariable("userId") Long userId){
        return  iLikeService.insert(likeDTO,postId,userId);
    }
    @DeleteMapping("/like")
    public LikeDTO deleteShare(@RequestBody Long id){
            return iLikeService.delete(id);
    }
    @GetMapping("/like")
    public Long count(@RequestBody Long idpost){
        return  iLikeService.countLikePost(idpost);
    }
}
