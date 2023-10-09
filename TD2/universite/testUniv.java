package universite;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class testUniv {

        // question 1 : 
    /* as: affiche * P<E> * N -> () 
     * as: affiche * P<E> * sur une année -> affiche. 
    */
    // Cela peut être une méthode static ou pas. 
    public void afficheSi(String[] entete, Predicate<Etudiant> pred, Annee a ){

        // Exemple je veux afficher tous les étudiants 
        // as("** Tous les étudiants", e->true,Année(2023)); 
    //Le mieux est de mettre sur Etudiant selon le diagramme de classe. 
        System.out.println(entete); 
        for(Etudiant e :  a.etudiants()){
            if(pred.test(e)){
                System.out.println(e); 
            }
        }
        //Consumer<Etudiant> ce = e-> {if(pred.test(e)) System.out.println(e); }; 
        //a.etudiants().forEach(ce);
    }
    public static void main(String[] argv){

        Predicate<Etudiant> aDEF = e-> (e1= e.notes().keySet(); e2={}; for(UE u: e.annee().ues()){
            e2.addAll(u.ects().keySet);
        }); 
    }
}
