package root.design.flyweight;

public class FlyWeightTest
{

    public static void main(String[] args)
    {
        ShapeFactory.createShape("Red");
        ShapeFactory.createShape("Green");
        ShapeFactory.createShape("Red");
        ShapeFactory.createShape("Red");
        ShapeFactory.createShape("Red");
        ShapeFactory.createShape("Red");
        System.out.println(ShapeFactory.getShapeSize());
    }
}
