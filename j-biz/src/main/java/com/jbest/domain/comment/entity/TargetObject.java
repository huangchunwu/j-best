package com.jbest.domain.comment.entity;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class TargetObject {
    
    private String targetType;
    private String targetId;

}
