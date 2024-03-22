package com.KA.algorithm.patterns.structural.composite;

public class Project {
    public static void main(String[] args) {
        Team team = new Team();

        Developer developer = new JavaDeveloper();
        Developer secondJavaDeveloper = new JavaDeveloper();
        Developer cppDeveloper = new CppDeveloper();

        team.addDeveloper(developer);
        team.addDeveloper(secondJavaDeveloper);
        team.addDeveloper(cppDeveloper);

        team.createProject();
    }
}
