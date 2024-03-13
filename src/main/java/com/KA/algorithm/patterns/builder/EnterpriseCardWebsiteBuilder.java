package com.KA.algorithm.patterns.builder;

public class EnterpriseCardWebsiteBuilder extends WebsiteBuilder {
    @Override
    void buildName() {
        website.setBuildName("EnterpriseName");
    }

    @Override
    void buildCms() {
        website.setCms(50);
    }

    @Override
    void buildPrice() {
        website.setPrice(75.45);
    }
}
