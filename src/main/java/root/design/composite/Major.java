package root.design.composite;


public class Major extends OrganizationComponent
{
    public Major(String name, String description)
    {
        super(name, description);
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
        System.out.println(getName() + "\t" + getDescription());;
    }
}
