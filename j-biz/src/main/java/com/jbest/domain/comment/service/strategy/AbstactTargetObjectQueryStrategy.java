package com.jbest.domain.comment.service.strategy;

import com.jbest.domain.comment.entity.TargetObject;

public abstract class AbstactTargetObjectQueryStrategy {

    public abstract String getTargetType();

    public abstract String apply(TargetObject targetObject);
    
}
