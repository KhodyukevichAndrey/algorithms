package com.KA.algorithm.patterns.behavioral.memento;

import lombok.Data;

import java.util.Date;

@Data
public class Save {
    private final String version;
    private final Date date;

    public Save(String version) {
        this.version = version;
        this.date = new Date();
    }


}
