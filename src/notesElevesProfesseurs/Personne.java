package notesElevesProfesseurs;

public class Personne {
    String nom;
    String prenom;

    public Personne(String prenom, String nom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }


    @Override
    public String toString() {
        return  prenom+ " "+nom;
    }
}
