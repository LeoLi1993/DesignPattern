package root.design.flyweight;

public class Circle implements Shape
{
    private String color;

    public Circle(String color)
    {
        this.color = color;
    }

    @Override
    public void draw()
    {
        System.out.println("draw circle");
    }
}
