package org.example;

import org.example.cppDeveloper.CppDeveloperFactory;
import org.example.javaDeveloper.JavaDeveloperFactory;
import org.example.phpDeveloper.PhpDeveloperFactory;

public class App
{
    public static void main( String[] args )
    {
        DeveloperFactory developerFactory = createDeveloperBySpec("java");
        Developer developer = developerFactory.createDeveloper();

        developer.WriteCode();
    }

    static DeveloperFactory createDeveloperBySpec (String spec) {
        switch (spec) {
            case "java":
                return new JavaDeveloperFactory();
            case "c++":
                return new CppDeveloperFactory();
            case "php":
                return new PhpDeveloperFactory();
            default:
                throw new RuntimeException("specialty [" + spec + "] not exist.");
        }
    }
}
