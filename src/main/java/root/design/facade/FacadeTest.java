package root.design.facade;

public class FacadeTest
{
    public static void main(String[] args)
    {
        GeneralFacade facade = new GeneralFacade();

        facade.generalInspect();
        facade.bloodInspect();
        facade.sightInspect();
    }
}
