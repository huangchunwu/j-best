package com.jbest.controller;

import com.jbest.dto.TargetObject;
import com.jbest.strategy.TargetObjectHandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/comment")
public class CommentController {
    

    @Autowired
    private TargetObjectHandler targetObjectHandler;

    @GetMapping("/detail/query")
    public  String  queryCommentDetail(@RequestParam String targetId,@RequestParam String targetType){
        TargetObject targetObject = TargetObject.builder().targetType(targetType).targetId(targetId).build();
        return targetObjectHandler.handle(targetObject);
    }
}
