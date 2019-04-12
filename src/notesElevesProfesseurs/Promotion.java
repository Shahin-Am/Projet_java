package notesElevesProfesseurs;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Promotion {
    String name;
    Container eleves;

    public Promotion(String name, Component eleve) {
        this.name = name;
        eleves.add(eleve);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Container getEleves() {
        return eleves;
    }
public void Rechercher(Container c){
    Iterator it = c.iterator() ;
}
}

