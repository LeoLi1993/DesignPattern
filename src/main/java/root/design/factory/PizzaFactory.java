package root.design.factory;

import root.design.factory.model.*;

public class PizzaFactory extends AbstractFactory
{
    @Override
    public Object createObject(Object object)
    {
        Pizza pizza = null;
        if(object instanceof GreekPizza)
        {
            pizza = new GreekPizza("Greek Pizza");
        }
        return pizza;
    }

    @Override
    public Shape createShape(Shape shape)
    {
        Shape realShape = null;
        if(shape instanceof Square)
        {
            realShape = new Square("Square");
        }
        return realShape;
    }

    @Override
    public Color createColor(Color color)
    {
        Color realColor = null;
        if(color instanceof Red)
        {
            realColor = new Red("Red");
        }
        return color;
    }
}
