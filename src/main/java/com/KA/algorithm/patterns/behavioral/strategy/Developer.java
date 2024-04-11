package com.KA.algorithm.patterns.behavioral.strategy;

import lombok.Data;

@Data
public class Developer {
    Activity activity;

    public void executeActivity() {
        activity.justDoIt();
    }
}
