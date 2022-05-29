package com.jbest.strategy;

import com.jbest.dto.TargetObject;

public abstract class AbstactTargetObjectQueryStrategy {

    public abstract String getTargetType();

    public abstract String apply(TargetObject targetObject);
    
}
