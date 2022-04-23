package root.design.singleton;

public class LazySingleton
{
    private static LazySingleton instance;

    private LazySingleton()
    {

    }

    public static LazySingleton getInstance()
    {
        if(null == instance)
        {
            instance = new LazySingleton();
        }
        return instance;
    }
}
