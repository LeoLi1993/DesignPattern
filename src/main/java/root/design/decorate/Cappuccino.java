package root.design.decorate;

public class Cappuccino extends Drink
{
    @Override
    public String getDescription()
    {
        return "add one Cappuccino and cost is 12";
    }

    @Override
    public double getCost()
    {
        return 12.0;
    }
}
