package com.example.socialcomment.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "share")
public class ShareEntity extends BaseEntity{
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "post_id")
    private PostEntity post;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private UserEntity user;
}
