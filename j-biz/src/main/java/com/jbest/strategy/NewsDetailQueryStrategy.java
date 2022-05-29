package com.jbest.strategy;

import com.jbest.dto.TargetObject;
import com.jbest.enums.TargetObjectType;

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
