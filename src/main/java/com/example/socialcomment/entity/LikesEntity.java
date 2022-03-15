package com.example.socialcomment.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "likes")
public class LikesEntity extends BaseEntity{
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "post_id")
    private PostEntity post;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private UserEntity user;
}
