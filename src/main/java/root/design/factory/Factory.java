package root.design.factory;

import root.design.factory.model.Color;
import root.design.factory.model.Shape;

public interface Factory
{
    Object createObject(Object object);

    Shape createShape(Shape shape);

    Color createColor(Color color);
}
