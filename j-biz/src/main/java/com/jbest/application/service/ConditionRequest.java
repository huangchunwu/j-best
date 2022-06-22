package com.jbest.application.service;

import java.util.Optional;

import lombok.Data;

@Data
public class ConditionRequest {

    private String userId;

    private String parentId;

    private String title;

    public Optional<String> getUserIdVal(){
        return Optional.ofNullable(userId);
    }
    
    public Optional<String> getParentIdVal(){
        return Optional.ofNullable(parentId);
    }

    public Optional<String> getTitleVal(){
        return Optional.ofNullable(title);
    }

}
