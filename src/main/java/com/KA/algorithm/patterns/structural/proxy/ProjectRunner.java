package com.KA.algorithm.patterns.structural.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("Http...");

        project.run();
    }
}
