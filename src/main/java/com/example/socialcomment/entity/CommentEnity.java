package com.example.socialcomment.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name= "comment")
public class CommentEnity extends BaseEntity{
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private UserEntity userComment;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "post_id")
    private PostEntity post;

    @Column(columnDefinition = "LONGTEXT")
    private String content;

}
