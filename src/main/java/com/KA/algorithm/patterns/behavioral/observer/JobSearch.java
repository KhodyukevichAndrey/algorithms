package com.KA.algorithm.patterns.behavioral.observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("First java pos");
        jobSite.addVacancy("Second java pos");

        Observer firstSubscriber = new Subscriber("first name");
        Observer secondSubscriber = new Subscriber("second name");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancy("Third java pos");
    }
}
