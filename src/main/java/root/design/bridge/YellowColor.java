package root.design.bridge;

public class YellowColor extends Color
{
    public YellowColor(IBagUsage bagUsage)
    {
        super(bagUsage);
    }

    @Override
    public void printColor()
    {
        System.out.println("Yellow");
        bagUsage.usage();
    }
}
