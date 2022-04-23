package root.design;

import root.design.builder.CommonHouseBuilder;
import root.design.builder.HouseBuilder;
import root.design.builder.HouseDirector;
import root.design.builder.model.CommonHouse;
import root.design.builder.model.House;
import root.design.clone.Sheep;
import root.design.factory.Factory;
import root.design.factory.PizzaFactory;
import root.design.factory.model.*;

public class Test
{
    public static void main(String[] args)
    {
        /*Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);*/

        /*StaticSingleton instance1 = StaticSingleton.getInstance();
        StaticSingleton instance2 = StaticSingleton.getInstance();
        System.out.println(instance1 == instance2);
        */
        /*StaticInnerSingleton instance1 = StaticInnerSingleton.getInstance();
        StaticInnerSingleton instance2 = StaticInnerSingleton.getInstance();
        System.out.println(instance1 == instance2);*/

        /*SimpleFactory simpleFactory = new SimpleFactory();
        Pizza pizza = simpleFactory.createPizza(new Pepper());
        System.out.println(pizza.getName());*/

        /*Factory factory = new PizzaFactory();
        factory.createColor(new Red());
        factory.createShape(new Square());
        factory.createObject(new Pepper());*/

        /*Sheep friend = new Sheep();
        friend.setName("Maggie");
        friend.setFriend(null);

        Sheep sheep = new Sheep("Leo", friend);

        Sheep sheep1 = (Sheep) sheep.clone();
        Sheep sheep2 = (Sheep)sheep.clone();
        System.out.println(sheep.getFriend());
        System.out.println(sheep1.getFriend());
        System.out.println(sheep2.getFriend());*/

        House house = new CommonHouse();
        HouseBuilder houseBuilder = new CommonHouseBuilder(house);
        HouseDirector houseDirector = new HouseDirector(houseBuilder);
        houseDirector.buildHouse();


    }
}
