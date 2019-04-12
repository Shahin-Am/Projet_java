package notesElevesProfesseurs;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Promotion {
    String name;
    ArrayList<Eleve> eleves= new ArrayList<Eleve>();


    public Promotion(String name) {
        this.name = name;
        System.out.println("Promo ajoutée !");
    }

    public void Add_eleve(Eleve eleve) throws IllegalStateException {
        eleves.add(eleve);
        System.out.println("Eleve ajoutée !");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Eleve> getEleves() {
        return eleves;
    }
public Eleve Rechercher(String nom){

    Iterator<Eleve> iter = eleves.iterator();
    System.out.println("\n Recherche : ");
    while (iter.hasNext()) {
        Eleve e = iter.next();
        if(e.nom==nom){
return e;
        }
    }
    return null;
}

}

