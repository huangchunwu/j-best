package com.jbest.domain.comment.service.strategy;

import com.jbest.domain.comment.entity.TargetObject;
import com.jbest.domain.comment.entity.valueObject.TargetObjectType;

import org.springframework.stereotype.Component;

@Component
public class FundDetailQueryStrategy extends AbstactTargetObjectQueryStrategy{

    @Override
    public String getTargetType() {
        return TargetObjectType.FUND.getType();
    }

    @Override
    public String apply(TargetObject targetObject) {
        return "fund";
    }
    
}
