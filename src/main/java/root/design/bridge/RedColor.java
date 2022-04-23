package root.design.bridge;

public class RedColor extends Color
{
    public RedColor(IBagUsage bagUsage)
    {
        super(bagUsage);
    }

    @Override
    public void printColor()
    {
        System.out.println("Red");
        bagUsage.usage();
    }
}
