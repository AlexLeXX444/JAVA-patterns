package org.example;

import org.example.banking.BankingTeamFactory;
import org.example.website.WebsiteTeamFactory;

public class App
{
    public static void main( String[] args )
    {
        ProjectTeamFactory projectBankFactory = new BankingTeamFactory();
        Developer bankDeveloper = projectBankFactory.getDeveloper();
        Tester bankTester = projectBankFactory.getTester();
        ProjectManager bankPM = projectBankFactory.getProjectManager();

        System.out.println("Banking team:");
        bankDeveloper.writeCode();
        bankTester.testCode();
        bankPM.manageProject();

        System.out.println("\n");

        ProjectTeamFactory projectWebsiteFactory = new WebsiteTeamFactory();
        Developer websiteDeveloper = projectWebsiteFactory.getDeveloper();
        Tester websiteTester = projectWebsiteFactory.getTester();
        ProjectManager websitePM = projectWebsiteFactory.getProjectManager();

        System.out.println("Website team:");
        websiteDeveloper.writeCode();
        websiteTester.testCode();
        websitePM.manageProject();
    }
}
