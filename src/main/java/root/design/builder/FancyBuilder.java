package root.design.builder;

import root.design.builder.model.House;

public class FancyBuilder extends HouseBuilder
{

    public FancyBuilder(House house)
    {
        super(house);
    }

    @Override
    public void buildBase()
    {
        System.out.println("build fancy base");
    }

    @Override
    public void buildWall()
    {
        System.out.println("build fancy wall");
    }

    @Override
    public void buildRoof()
    {
        System.out.println("build fancy roof");
    }
}
