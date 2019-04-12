package notesElevesProfesseurs;

import java.util.Iterator;

public class Professeur extends Personne { //QUESTION 1 --> HERITAGE DE LA CLASSE PERSONNE POUR LES CLASSES ELEVE ET PROFESSEUR

    public Professeur(String prenom,String nom) {
        super(prenom,nom);
    }
    public Eleve Rechercher(Promotion promo, String nom){

        Iterator<Eleve> iter = promo.eleves.iterator();
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
