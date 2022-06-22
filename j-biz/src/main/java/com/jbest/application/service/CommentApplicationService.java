package com.jbest.application.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbest.domain.comment.entity.Comment;
import com.jbest.domain.comment.entity.TargetObject;
import com.jbest.domain.comment.service.CommentDomainService;

@Service
public class CommentApplicationService {
    

    @Autowired
    private CommentDomainService commentDomainService;


    public String queryTargetObject(String targetId,String targetType){
        TargetObject targetObject = TargetObject.builder().targetType(targetType).targetId(targetId).build();
        return commentDomainService.handle(targetObject);
    }


    public List<Comment> multiQuery(ConditionRequest request) {

        // 数据库中的数据
        List<Comment> comments = queryDB();

        // 组合多种查询条件
        List<Predicate<Comment>> conditions = new ArrayList<Predicate<Comment>>(); 

        // 根据userId查询
        request.getUserIdVal().ifPresent(userId->conditions.add(req->userId.equals(req.getUserId())));

        // 根据parentId查询
        request.getParentIdVal().ifPresent(parentId->conditions.add(req->parentId.equals(req.getParentId())));

        // 根据标题查询
        request.getTitleVal().ifPresent(title->{
            conditions.add(req->title.equals(req.getTitle()));
        });

       // 根据 其他条件。。。。。。
       // 。。。。。。。

        List<Comment> filterList =  comments.stream().filter(conditions.stream().reduce(x->true, Predicate::and)).collect(Collectors.toList());

        return filterList;
    }


    public List<Comment> queryDB(){
        return new ArrayList<>();
    }

}
