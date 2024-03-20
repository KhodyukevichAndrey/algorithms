package com.KA.algorithm.patterns.creational.factory;

import com.KA.algorithm.patterns.creational.factory.developer.Developer;
import com.KA.algorithm.patterns.creational.factory.developerfactory.CppDeveloperFactory;
import com.KA.algorithm.patterns.creational.factory.developerfactory.DeveloperFactory;
import com.KA.algorithm.patterns.creational.factory.developerfactory.JavaDeveloperFactory;

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
