package root.design.singleton;

public class StaticSingleton
{
    private static StaticSingleton instance;

    static
    {
        instance = new StaticSingleton();
    }

    private StaticSingleton()
    {

    }

    public static StaticSingleton getInstance()
    {
        return instance;
    }
}
