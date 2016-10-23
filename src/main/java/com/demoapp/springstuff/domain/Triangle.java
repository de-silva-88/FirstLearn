package com.demoapp.springstuff.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
@ToString
public class Triangle {
    private String type;
    private String drawnBy;
    private int longest;
    
    public void draw() {
        log.info("Drawing triangle with attributes ... {}", toString());
    }
}
