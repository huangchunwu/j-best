package com.jbest.domain.comment.entity;

import lombok.Data;

@Data
public class Comment {

    private Long id;
    private TargetObject targetObject;
    private String userId;
    private String parentId;
    private String title;
}
