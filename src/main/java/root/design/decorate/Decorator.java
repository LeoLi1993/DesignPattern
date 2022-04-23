package root.design.decorate;


public class Decorator extends Drink
{
    private Drink drink;

    public Decorator()
    {

    }
    public Decorator(Drink drink)
    {
        this.drink = drink;
    }

    @Override
    public String getDescription()
    {
        return drink.getDescription();
    }

    @Override
    public double getCost()
    {
        return drink.getCost();
    }
}
