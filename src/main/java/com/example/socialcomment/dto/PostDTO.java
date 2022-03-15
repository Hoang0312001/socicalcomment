package com.example.socialcomment.dto;

import lombok.*;

@Data
@Getter
@Setter
public class PostDTO extends AbtractDTO{
    private String content;
    private Integer privicy;
}
