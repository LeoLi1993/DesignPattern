package root.design.singleton;

public class DCLSingleton
{
    private static volatile DCLSingleton instance;

    private DCLSingleton()
    {

    }

    public static DCLSingleton getInstance()
    {
        if(null == instance)
        {
            synchronized (DCLSingleton.class)
            {
                if(null == instance)
                {
                    instance = new DCLSingleton();
                }
            }
        }

        return instance;
    }
}
