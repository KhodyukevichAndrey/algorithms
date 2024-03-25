package com.KA.algorithm.patterns.structural.decorator;

public class SeniorJavaDeveloper extends DeveloperDecorator {
    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String makeCodeReview() {
        return "make Code Review";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeCodeReview() + '\n';
    }
}
