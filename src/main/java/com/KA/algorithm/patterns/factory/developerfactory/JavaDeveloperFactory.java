package com.KA.algorithm.patterns.factory.developerfactory;

import com.KA.algorithm.patterns.factory.developer.Developer;
import com.KA.algorithm.patterns.factory.developer.JavaDeveloper;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
