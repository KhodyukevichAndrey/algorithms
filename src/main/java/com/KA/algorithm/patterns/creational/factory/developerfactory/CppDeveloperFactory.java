package com.KA.algorithm.patterns.creational.factory.developerfactory;

import com.KA.algorithm.patterns.creational.factory.developer.CppDeveloper;
import com.KA.algorithm.patterns.creational.factory.developer.Developer;

public class CppDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
