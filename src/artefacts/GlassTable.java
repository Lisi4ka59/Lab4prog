package artefacts;

import artefacts.Artefact;

import java.util.ArrayList;

public class GlassTable extends Artefact {
    public ArrayList<Artefact> artefacts = new ArrayList<>();

    public GlassTable(){
        artefacts.add(new Book());
        artefacts.add(new Key());
    }
}
