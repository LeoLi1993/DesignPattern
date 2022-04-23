package root.design.adapter;

public class VoltageAdapter implements IVoltage5V
{
    private Voltage220V voltage220V;

    @Override
    public int output5V()
    {
        int src = this.voltage220V.output220V();
        return src/44;
    }

    public VoltageAdapter()
    {

    }

    public VoltageAdapter(Voltage220V voltage220V)
    {
        this.voltage220V = voltage220V;
    }
}
