package notesElevesProfesseurs;


import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

import java.lang.reflect.Array;
import java.util.*;
import java.lang.IllegalAccessException;

public class Eleve  extends Personne  { //QUESTION 1 --> HERITAGE DE LA CLASSE PERSONNE POUR LES CLASSES ELEVE ET PROFESSEUR

    int id_Etudiant;
    String date_naissance;
    final int NB_EVALUATIONS = 10;
    ArrayList<Evaluation> evaluations=new ArrayList<>();
    HashSet<Professeur> list_correcteur=new HashSet();

    public Eleve(String prenom,String nom,String date) {
        super(prenom, nom);
        date_naissance = date ;
    }

    public int getId_Etudiant() {
        return id_Etudiant;
    }
    public void set_Evaluations(Evaluation nEvaluations)//Affecte la liste de toutes les évaluations
    {
        evaluations.add(nEvaluations);
    }

    private void verifierEval() throws IllegalStateException {

        if (evaluations==null || evaluations.isEmpty()){
            throw new IllegalStateException("L'éleve n'a pas d'évaluation");

        }
    }

    public double calculMoyenne() throws IllegalStateException {

    verifierEval();


    double cumul =0;
    for(int i=0; i<this.evaluations.size();i++)
        cumul=cumul+evaluations.get(i).getNote();

    return cumul/evaluations.size();




    }

    public double median() {
        int middle = evaluations.size()/2;
        verifierEval();
        Comparator c1 = new Comparator<Evaluation>(){
            int a=0;
            public int compare(Evaluation note1, Evaluation note2){

                if(note1.note<=note2.note)
                    a= -1;
                if(note1.note>note2.note)
                    a= 1;
                return a;
            }
        };
        Collections.sort(evaluations,c1);
        if (evaluations.size()%2 == 1) {
            return evaluations.get(evaluations.size()/2).getNote();
        } else {
            return (evaluations.get((evaluations.size()/2)-1).getNote() + evaluations.get(evaluations.size()/2).getNote()) / 2.0;
        }
    }

    public Set<Professeur> getCorrecteurs(Professeur prof){
        list_correcteur.add(prof);
        return list_correcteur;
    }

    public ArrayList<Evaluation> getEvaluations() {
        return evaluations;
    }

    public HashSet<Professeur> getList_correcteur() {
        return list_correcteur;
    }

    @Override
    public String toString() {

        String n;
        Iterator<Evaluation> iter = evaluations.iterator();
        ArrayList<String> notes=new ArrayList<>();
        for (int i=0;i<evaluations.size();i++){
            n=evaluations.get(i).matiere;
            notes.add(n);
            n= String.valueOf(evaluations.get(i).getNote());
            notes.add(n);
        }
        return "("+this.prenom+","+this.nom+") "+
                "id = " + id_Etudiant +"\n"+
                "notes:"+ notes+ "\n"+
                "Moyenne ="+this.calculMoyenne()+"\n"+
                "Median ="+this.median()+"\n"+
                "correcteurs=" + list_correcteur +
                '}';
    }
}
