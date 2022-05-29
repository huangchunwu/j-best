package com.jbest.strategy;

import com.jbest.dto.TargetObject;
import com.jbest.enums.TargetObjectType;

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
