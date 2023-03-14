import artefacts.Artefact;
import artefacts.Corridor;
import artefacts.GlassTable;

import java.util.ArrayList;

public class Room {
    ArrayList<Artefact> artefacts = new ArrayList<>();

    Room (){
        artefacts.add(new GlassTable());
        artefacts.add(new Corridor());
    }
}
