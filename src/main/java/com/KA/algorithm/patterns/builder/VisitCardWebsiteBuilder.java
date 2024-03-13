package com.KA.algorithm.patterns.builder;

public class VisitCardWebsiteBuilder extends WebsiteBuilder {

    @Override
    void buildName() {
        website.setBuildName("VisitName");
    }

    @Override
    void buildCms() {
        website.setCms(15);
    }

    @Override
    void buildPrice() {
        website.setPrice(15.45);
    }
}
