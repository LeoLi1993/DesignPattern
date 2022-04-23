package root.design.bridge;

public class WalletUsageImpl implements IBagUsage
{
    @Override
    public void usage()
    {
        System.out.println("Wallet");
    }
}
