package root.design.decorate;

public class MilkDecorator extends Decorator
{
    public MilkDecorator()
    {

    }

    public MilkDecorator(Drink drink)
    {
        super(drink);
    }

    @Override
    public String getDescription()
    {
        System.out.println(super.getDescription());
        return "add one Milk and cost is 5";
    }

    @Override
    public double getCost()
    {
        return super.getCost() + 5;
    }

}
