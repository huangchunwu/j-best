package com.jbest.domain.comment.service;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.jbest.domain.comment.entity.TargetObject;
import com.jbest.domain.comment.service.strategy.AbstactTargetObjectQueryStrategy;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class CommentDomainService  implements InitializingBean{


    @Autowired
    private ApplicationContext applicationContext;
    private Map<String, AbstactTargetObjectQueryStrategy>  methodMap = new HashMap<>();

    @Override
    public void afterPropertiesSet() throws Exception {
       
        Map<String,AbstactTargetObjectQueryStrategy> beanName = 
                    applicationContext.getBeansOfType(AbstactTargetObjectQueryStrategy.class);
        methodMap =  beanName.values().stream()
                    .collect(Collectors.toMap(item->item.getTargetType(), Function.identity()));

    }
    

    public  String handle( TargetObject targetObject){
       return methodMap.get(targetObject.getTargetType()).apply(targetObject);
    }



}
