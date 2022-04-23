package root.design.decorate;

public class Latte extends Drink
{
    @Override
    public String getDescription()
    {
        return "add one Latte and cost is 8";
    }

    @Override
    public double getCost()
    {
        return 8.0;
    }
}
