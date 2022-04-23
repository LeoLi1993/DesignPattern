package root.design.flyweight;

public class Square implements Shape
{
    private String color;

    public Square(String color)
    {
        this.color = color;
    }
    @Override
    public void draw()
    {
        System.out.println("draw square");
    }
}
