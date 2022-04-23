package root.design.adapter;

import java.lang.ref.PhantomReference;

public class AdapterTest
{
    public static void main(String[] args)
    {
        VoltageAdapter voltageAdapter = new VoltageAdapter(new Voltage220V());
        Phone phone = new Phone();
        phone.charge(voltageAdapter);
    }
}
