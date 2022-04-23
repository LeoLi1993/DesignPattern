package root.design.clone;

import root.design.factory.model.Shape;


public class Sheep implements Cloneable
{
    private String name;
    private Sheep friend;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Sheep getFriend()
    {
        return friend;
    }

    public void setFriend(Sheep friend)
    {
        this.friend = friend;
    }

    public Sheep()
    {
    }

    public Sheep(String name, Sheep friend)
    {
        this.name = name;
        this.friend = friend;
    }

    @Override
    public Object clone()
    {
        Sheep sheep = null;
        try
        {
            sheep = (Sheep) super.clone();
            if(this.friend != null)
            {
                friend = (Sheep)this.friend.clone();
            }
            //friend = (Sheep) super.clone();
        } catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return sheep;
    }

}
