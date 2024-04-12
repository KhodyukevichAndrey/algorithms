package com.KA.algorithm.patterns.behavioral.templatemethod;

public class WelcomePage extends WebsiteTemplate {
    @Override
    public void showPageContent() {
        System.out.println("Welcome");
    }
}
