package com.jbest.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter
public enum TargetObjectType{

    COMMENT("1","new"),
    FUND("2","fund");

    private String type;
    private String name;



}