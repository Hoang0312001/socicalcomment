package com.example.socialcomment.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "post")
public class PostEntity extends BaseEntity{
    @ManyToOne
    @JoinColumn(name="user_id",updatable  = false)
    private UserEntity author;
    @Column(columnDefinition = "LONGTEXT")
    private String content;
    @Column
    private Integer privicy; /* 1-cong khai 2-ban be 3- chi minh toi*/
//
    @OneToMany(mappedBy = "post")
    private List<CommentEnity> comments =new ArrayList<>();
    @OneToMany(mappedBy = "user")
    private List<LikesEntity> likes = new ArrayList<>();
    @OneToMany(mappedBy = "post")
    private List<ShareEntity> shares = new ArrayList<>();
}
