package root.design.composite;

import com.sun.org.apache.xpath.internal.operations.Or;

public class CompositeTest
{
    public static void main(String[] args)
    {
        OrganizationComponent university = new University("Chengdu University", "chengdu university");

        OrganizationComponent computerInstitute = new Institute("Computer Institute", "computer institute");
        OrganizationComponent economyInstitute = new Institute("Economy Institute", "economy institute");

        OrganizationComponent networkMajor = new Major("Network Engineering","network engineering");
        OrganizationComponent softwareMajor = new Major("Software Engineering", "software engineering");
        OrganizationComponent publicManagementMajor = new Major("Public Management", "public management");



        computerInstitute.add(networkMajor);
        computerInstitute.add(softwareMajor);
        economyInstitute.add(publicManagementMajor);
        university.add(computerInstitute);
        university.add(economyInstitute);

        university.display();;
        System.out.println("*************************");
        computerInstitute.display();;
    }
}
