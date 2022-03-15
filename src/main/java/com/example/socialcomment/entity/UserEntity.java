package com.example.socialcomment.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "user")
public class UserEntity extends BaseEntity{
    @Column(unique = true, columnDefinition = "varchar(15)")
    private String username;
    @Column(columnDefinition = "nvarchar(255)")
    private String password;
    @OneToMany(mappedBy = "userComment")
    private List<CommentEnity> news = new ArrayList<>();
    @OneToMany(mappedBy = "user")
    private List<LikesEntity> likes = new ArrayList<>();
    @OneToMany(mappedBy = "author")
    private List<PostEntity> authors = new ArrayList<>();
    @OneToMany(mappedBy = "user")
    private List<ShareEntity> shares = new ArrayList<>();



}
