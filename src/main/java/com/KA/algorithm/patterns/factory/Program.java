package com.KA.algorithm.patterns.factory;

import com.KA.algorithm.patterns.factory.developer.Developer;
import com.KA.algorithm.patterns.factory.developerfactory.CppDeveloperFactory;
import com.KA.algorithm.patterns.factory.developerfactory.DeveloperFactory;
import com.KA.algorithm.patterns.factory.developerfactory.JavaDeveloperFactory;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpecialty("cpp");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }

    static DeveloperFactory createDeveloperBySpecialty (String specialty) {
        if(specialty.equals("java")) {
            return new JavaDeveloperFactory();
        } else if (specialty.equals("cpp")) {
            return new CppDeveloperFactory();
        } else {
            throw new RuntimeException("Unknown specialty");
        }
    }
}
