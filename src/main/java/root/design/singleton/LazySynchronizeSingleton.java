package root.design.singleton;

public class LazySynchronizeSingleton
{
    private static LazySynchronizeSingleton instance;

    private LazySynchronizeSingleton()
    {

    }

    public synchronized LazySynchronizeSingleton getInstance()
    {
        if(null == instance)
        {
            instance = new LazySynchronizeSingleton();
        }
        return instance;
    }
}
