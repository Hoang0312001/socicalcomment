package com.example.socialcomment.controller.api;

import com.example.socialcomment.dto.CommentDTO;
import com.example.socialcomment.service.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@RestController
public class CommentController {
    @Autowired
    private ICommentService iCommentService;
    @GetMapping("/")
    public ModelAndView createComment(){
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("model",iCommentService.getAll());
            return mav;
    }
    @PostMapping("/cmt/{userId}/{postId}")
    public CommentDTO createComment(@RequestBody CommentDTO dto,@PathVariable("userId") Long userid,@PathVariable("postId") Long postId){
       return iCommentService.save(dto,userid,postId);
    }
    @PutMapping("/cmt/{id}")
    public CommentDTO UpdateComment(@RequestBody CommentDTO dto,@PathVariable("id") Long id){
        return iCommentService.update(id,dto);
    }
    @DeleteMapping("/cmt")
    public CommentDTO DeleteComment(@RequestBody Long id){
            return iCommentService.delete(id);
    }
}
