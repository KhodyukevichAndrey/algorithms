package com.KA.algorithm.patterns.creational.factory.developerfactory;

import com.KA.algorithm.patterns.creational.factory.developer.Developer;
import com.KA.algorithm.patterns.creational.factory.developer.JavaDeveloper;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
