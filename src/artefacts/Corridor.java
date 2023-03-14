package artefacts;

public class Corridor extends  Artefact{
    String description = "чуть пошире крысиного лаза";

    private WonderfulGarden garden = new WonderfulGarden();
    public WonderfulGarden leadTo()
    {
        return garden;
    }

}
