package notesElevesProfesseurs;

public class Main1 {
    public static void main(String[] args) {

        Eleve e1 = new Eleve("Jean","Duval","12/04/1998",0);
        Eleve e2 = new Eleve("Alexandra","Bergot","19/12/2000",1);

        Professeur p1 = new Professeur("Jack", "Dutronc");
        Professeur p2 = new Professeur("Alice", "Thirard");

        System.out.println(p1);
        //ELEVE 1
        Evaluation eval1 = new Evaluation("Mathemmatique",(float) 12,e1,p1);
        Evaluation eval2 = new Evaluation("Francais",(float) 18,e1,p2);
        Evaluation eval3 = new Evaluation("Sport",(float) 9,e1,p1);
        Evaluation eval4 = new Evaluation("Philo",(float) 11,e1,p2);
        //ELEVE 2
        Evaluation eval5 = new Evaluation("Mathemmatique",(float) 15,e2,p1);
        Evaluation eval6 = new Evaluation("Francais",(float) 14,e2,p2);
        Evaluation eval7 = new Evaluation("Sport",(float) 9,e2,p1);
        Evaluation eval8 = new Evaluation("Philo",(float) 5,e2,p2);

        System.out.println(e1.getEvaluations());
        System.out.println(e1.getList_correcteur());

        Promotion promo1 = new Promotion("promo1");
        Promotion promo2 = new Promotion("promo2");

        promo1.Add_eleve(e1);
        promo2.Add_eleve(e2);

        System.out.println(e1);
        System.out.println(e2);

        System.out.println(promo2.Rechercher("Bergot"));
        System.out.println(p1.Rechercher(promo2,1));
    }
}
