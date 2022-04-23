package root.design.builder;

import root.design.builder.model.House;

public class CommonHouseBuilder extends HouseBuilder
{
    public CommonHouseBuilder(House house)
    {
        super(house);
    }

    @Override
    public void buildBase()
    {
        System.out.println("build common base");
    }

    @Override
    public void buildWall()
    {
        System.out.println("build common wall");
    }

    @Override
    public void buildRoof()
    {
        System.out.println("build common roof");
    }
}
