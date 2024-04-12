package com.KA.algorithm.patterns.behavioral.templatemethod;

public class NewsPage extends WebsiteTemplate {
    public void showPage() {
        System.out.println("Header");
        showPageContent();
        System.out.println("Footer");
    }

    @Override
    public void showPageContent() {
        System.out.println("News");
    }
}
