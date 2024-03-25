package com.KA.algorithm.patterns.structural.decorator;

public class Task {
    public static void main(String[] args) {
        Developer senior = new SeniorJavaDeveloper(new JavaDeveloper());
        Developer teamLead = new JavaTeamLead(senior);

        System.out.println(senior.makeJob());
        System.out.println(teamLead.makeJob());
    }
}
