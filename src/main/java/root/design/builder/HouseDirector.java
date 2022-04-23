package root.design.builder;

import root.design.builder.model.House;

public class HouseDirector
{
    private HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder)
    {
        this.houseBuilder = houseBuilder;
    }

    public House buildHouse()
    {
        this.houseBuilder.buildBase();
        this.houseBuilder.buildWall();
        this.houseBuilder.buildRoof();
        return this.houseBuilder.buildHouse();
    }
}
