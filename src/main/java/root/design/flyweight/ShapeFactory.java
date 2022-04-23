package root.design.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory
{
    private static Map<String, Shape> cache = new HashMap<>();

    public static Shape createShape(String color)
    {
        Shape shape = cache.get(color);
        if(null == shape)
        {
            shape = new Shape()
            {
                @Override
                public void draw()
                {

                }
            };
            cache.put(color, shape);
        }
        return shape;
    }

    public static int getShapeSize()
    {
        return cache.size();
    }
}
