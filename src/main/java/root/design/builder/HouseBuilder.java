package root.design.builder;

import root.design.builder.model.House;

public abstract class HouseBuilder
{
    private House house;

    public abstract void buildBase();

    public abstract void buildWall();

    public abstract void buildRoof();

    public HouseBuilder(House house)
    {
        this.house = house;
    }

    public House buildHouse()
    {
        return this.house;
    }
}
