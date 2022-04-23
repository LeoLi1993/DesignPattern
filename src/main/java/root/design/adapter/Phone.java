package root.design.adapter;

public class Phone
{
    public void charge(IVoltage5V iVoltage5V)
    {
        int output = iVoltage5V.output5V();
        if(5 == output)
        {
            System.out.println(" I can change.");
        }
        else
        {
            System.out.println(" I can not work.");
        }
    }
}
