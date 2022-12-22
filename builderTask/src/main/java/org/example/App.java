package org.example;

public class App 
{
    public static void main( String[] args )
    {
        Director director = new Director();

        director.setWebsiteBuilder(new EnterpriseWebsiteBuilder());
        Website website = director.buildWebside();

        System.out.println(website);
    }
}
