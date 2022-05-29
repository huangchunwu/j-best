package com.jbest.application.service;

import com.jbest.domain.comment.entity.TargetObject;
import com.jbest.domain.comment.service.CommentDomainService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentApplicationService {
    

    @Autowired
    private CommentDomainService commentDomainService;


    public String queryTargetObject(String targetId,String targetType){
        TargetObject targetObject = TargetObject.builder().targetType(targetType).targetId(targetId).build();
        return commentDomainService.handle(targetObject);
    }


}
