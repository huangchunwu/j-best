package com.jbest.domain.comment.service.strategy;

import com.jbest.domain.comment.entity.TargetObject;
import com.jbest.domain.comment.entity.valueObject.TargetObjectType;

import org.springframework.stereotype.Component;

@Component
public class NewsDetailQueryStrategy extends AbstactTargetObjectQueryStrategy{

    @Override
    public String getTargetType() {
        return TargetObjectType.COMMENT.getType();
    }

    @Override
    public String apply(TargetObject targetObject) {
        return "news";
    }
    
}
