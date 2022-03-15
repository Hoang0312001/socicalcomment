package com.example.socialcomment.controller.api;

import com.example.socialcomment.dto.ShareDTO;
import com.example.socialcomment.service.ICommentService;
import com.example.socialcomment.service.IShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ShareController {
    @Autowired
    private IShareService iShareService;
    @PostMapping("/share/{postId}/{userId}")
    public ShareDTO createShare(@RequestBody ShareDTO shareDTO,@PathVariable("postId") Long postId,@PathVariable("userId") Long userId){
        return iShareService.insert(shareDTO,postId,userId);
    }
    @DeleteMapping("/share")
    public ShareDTO deleteShare(@RequestBody Long id){
            return iShareService.delete(id);
    }
}
