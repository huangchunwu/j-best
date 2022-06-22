package com.jbest.domain.comment.service;

import java.util.List;

import com.jbest.domain.comment.entity.TargetObject;

@FunctionalInterface
public interface TargetObjectHandler {
    
    List<TargetObject> handle(String title);

}
