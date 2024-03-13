package com.KA.algorithm.patterns.builder;

public class BuilderWebsiteRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new VisitCardWebsiteBuilder());
        Website website = director.buildWebsite();
        System.out.println(website);
        director.setBuilder(new EnterpriseCardWebsiteBuilder());
        Website website1 = director.buildWebsite();
        System.out.println(website1);
    }
}
