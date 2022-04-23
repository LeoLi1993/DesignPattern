package root.design.factory.model;

public abstract class IceCream
{
    private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public IceCream()
    {
    }

    public IceCream(String name)
    {
        this.name = name;
    }
}
