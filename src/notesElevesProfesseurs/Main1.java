package notesElevesProfesseurs;

public class Main1 {
    public static void main(String[] args) {

        Eleve e1 = new Eleve("Jean","Duval","12/04/1998");
        Professeur p1 = new Professeur("Jack", "Dutronc");
        Professeur p2 = new Professeur("Alice", "Thirard");

        System.out.println(p1);
        Evaluation eval1 = new Evaluation("Mathemmatique",(float) 12,e1,p1);
        Evaluation eval2 = new Evaluation("Francais",(float) 18,e1,p2);
        Evaluation eval3 = new Evaluation("Sport",(float) 9,e1,p1);
        Evaluation eval4 = new Evaluation("Philo",(float) 11,e1,p2);


        System.out.println(e1.getEvaluations());
        System.out.println(e1.getList_correcteur());
        System.out.println(e1);

        Promotion promo1 = new Promotion("promo1");
        promo1.Add_eleve(e1);
        System.out.println(promo1.Rechercher("Duval"));
    }
}
