package root.design.decorate;

public class DecoratorTest
{
    public static void main(String[] args)
    {
        Drink latte = new Latte();
        Drink milk = new MilkDecorator(latte);

        System.out.println(milk.getDescription());
        System.out.println(milk.getCost());

        Drink soy = new SoyBeanDecorator(milk);
        System.out.println(soy.getDescription());
        System.out.println(soy.getCost());

    }
}
