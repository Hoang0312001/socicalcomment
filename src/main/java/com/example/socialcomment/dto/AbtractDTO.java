package com.example.socialcomment.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class AbtractDTO<T> {
    private Long id;
    private Date createddate;
    private List<T> listresult = new ArrayList<>();
}
