package root.design.facade;

public class GeneralFacade
{
    General general = new General();
    SightGeneral sightGeneral = new SightGeneral();
    BloodGeneral bloodGeneral = new BloodGeneral();

    public void generalInspect()
    {
        general.height();
        general.weight();
    }

    public void sightInspect()
    {
        sightGeneral.inspect();;
    }

    public void bloodInspect()
    {
        bloodGeneral.inspect();
    }
}
