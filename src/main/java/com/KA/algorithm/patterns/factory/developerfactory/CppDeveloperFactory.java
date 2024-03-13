package com.KA.algorithm.patterns.factory.developerfactory;

import com.KA.algorithm.patterns.factory.developer.CppDeveloper;
import com.KA.algorithm.patterns.factory.developer.Developer;

public class CppDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
