package com.jbest.infrastructure.common.event;

import java.util.Date;

import lombok.Data;

@Data
public class DomainEvent {

    String id;
    Date timestamp;
    String source;
    String data;
}
