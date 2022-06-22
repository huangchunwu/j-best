package com.jbest.domain.comment.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.UnaryOperator;

import com.jbest.domain.comment.entity.TargetObject;
import com.jbest.domain.comment.entity.valueObject.TargetObjectType;

import org.springframework.beans.factory.InitializingBean;

public class TargetObjectDomainService implements InitializingBean{



    public Map<TargetObjectType,TargetObjectHandler> handleMap = new HashMap<>();


    public  List<TargetObject> queryTargetObject(TargetObjectType targetObjectType,String title){
        return handleMap.get(targetObjectType).handle(title);
    }

    private List<TargetObject> queryNews(String title) {
        return  new ArrayList<TargetObject>();
    }
    
    private List<TargetObject> queryLive(String title) {
        return  new ArrayList<TargetObject>();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        TargetObjectHandler newsHander = (newsTitle) -> {return queryNews(newsTitle);};
        TargetObjectHandler liveHandle = (liveTitle) -> {return queryLive(liveTitle);};
        handleMap.put(TargetObjectType.COMMENT, newsHander);
        handleMap.put(TargetObjectType.FUND, liveHandle);


        UnaryOperator<Integer> operator = (a) -> a*10;
        UnaryOperator<Integer> tOperator = (a) -> a+10;

        operator.andThen(tOperator);
    }
}
