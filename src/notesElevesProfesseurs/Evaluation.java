package notesElevesProfesseurs;

import java.awt.*;

public class Evaluation {
    String matiere;
    Float note;
    Eleve eleve;
    Professeur professeur;

    public Evaluation(String matiere, Float note, Eleve eleve, Professeur professeur) {
        this.matiere = matiere;
        this.note = note;
        this.eleve = eleve;
        this.professeur = professeur;
        eleve.set_Evaluations(this);
        eleve.getCorrecteurs(this.professeur);
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public Float getNote() {
        return note;
    }

    public void setNote(Float note) {
        this.note = note;
    }

    public Eleve getEleve() {
        return eleve;
    }

    public void setEleve(Eleve eleve) {
        this.eleve = eleve;
    }

    public Professeur getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }

    @Override
    public String toString() {
        return "((" +
                eleve.prenom +", "+eleve.nom + ") (" +
                professeur +
                ") " + matiere +" "+
                note +
                ')';
    }
}
