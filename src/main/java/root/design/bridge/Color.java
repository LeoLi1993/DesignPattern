package root.design.bridge;

public abstract class Color
{
    protected IBagUsage bagUsage;

    public Color(IBagUsage bagUsage)
    {
        this.bagUsage = bagUsage;
    }

    public abstract void printColor();
}
