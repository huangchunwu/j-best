package com.jbest.interfaces.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jbest.application.service.CommentApplicationService;
import com.jbest.application.service.ConditionRequest;
import com.jbest.infrastructure.common.api.Response;

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

    @PostMapping("/cond/query")
    public Response  queryComment(@RequestBody ConditionRequest request){

        List result = commentApplicationService.multiQuery(request);

        return Response.ok(result);
    }

    
}
