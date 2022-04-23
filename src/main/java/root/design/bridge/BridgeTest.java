package root.design.bridge;

public class BridgeTest
{
    public static void main(String[] args)
    {
        IBagUsage bagUsage = new BackpackUsageImpl();
        Color color = new YellowColor(bagUsage);
        color.printColor();
    }
}
