package root.design.composite;

import java.util.ArrayList;
import java.util.List;

public class Institute extends OrganizationComponent
{
    List<OrganizationComponent> organizationComponentList = new ArrayList<>();

    public Institute(String name, String description)
    {
        super(name, description);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent)
    {
        organizationComponentList.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent)
    {
        organizationComponentList.remove(organizationComponent);
    }

    @Override
    public String getName()
    {
        return super.getName();
    }

    @Override
    public String getDescription()
    {
        return super.getDescription();
    }

    @Override
    protected void display()
    {
        System.out.println(getName() +"\t" + getDescription());
        for (OrganizationComponent organizationComponent : organizationComponentList)
        {
            organizationComponent.display();;
        }
    }
}
