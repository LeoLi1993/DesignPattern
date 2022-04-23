package root.design.decorate;

public class SoyBeanDecorator extends Decorator
{
    public SoyBeanDecorator(Drink drink)
    {
        super(drink);
    }


    @Override
    public String getDescription()
    {
        System.out.println(super.getDescription());
        return "add one SoyBean and cost is 3";
    }

    @Override
    public double getCost()
    {
        return super.getCost() + 3;
    }

}
