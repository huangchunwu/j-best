package com.jbest.interfaces.facade;

import com.jbest.application.service.CommentApplicationService;
import com.jbest.infrastructure.common.api.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/comment")
public class CommentController {
    

    @Autowired
    private CommentApplicationService commentApplicationService;

    @GetMapping("/detail/query")
    public  Response  queryCommentDetail(@RequestParam String targetId,@RequestParam String targetType){
         String result = commentApplicationService.queryTargetObject(targetId,targetType);
         return Response.ok(result);
    }
}
