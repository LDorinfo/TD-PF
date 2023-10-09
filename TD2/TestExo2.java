import java.util.function.Predicate;

public class TestExo2 {
    public static void main(String[] argv){
        Predicate<Integer> ttp = taille->(taille<100); 
        Predicate<Paire<Integer,Double>> ttp1 = p -> p.fst <100; 
        //Predicate<Personne> ttp2 = p-> (taille.getTaille())<100; 
        Predicate<Integer> ttg = taille->(taille>200); 
        Predicate<Paire<Integer,Double>> ttg1 = p -> p.fst >200; 
        //Predicate<Personne> ttg2 = p-> (taille.getTaille())>200; 

        Predicate<Integer> ti = taille-> ttp.test(taille) && ttg.test(taille); 
        Predicate<Paire<Integer,Double>> ti1 = p-> ttp1.and(ttg1); 

        Predicate<Integer> tc = taille -> ti1.negate(); //not(ti1); ou ! ti1.test(p)
        
        Predicate<Paire<Integer,Double>> ptl1= p-> p.snd >150; 

        List<T> FiltragePred(List<Predicate<T>> ps, List<T> es){
            // imaginons qu'on ait une liste de personne. Et je veux récupérer la liste des personnes qui ont une taille correcte et un poid correcte. 
            List<T> res = new ArrayList<T>(); 
            // boucle sur les personnes 
            //Puis boucle sur taille correcte, poid correcte => boucle sur les prédicats. 
            //es.stream().filter(ps)
            for(T e : es){
                boolean ok = true ; 
                for(Predicate<T> p : ps){
                    if(p.test(e)){

                        //Si c'est vrai je passe, 
                        // si c'est pas vrai je sors de la boucle. 
                    }
                    else{
                        ok = false; 
                        break; 
                        //Pb on ne sait pas si on est sorti parce que fin des prédicats. 
                    }
                }
            }
        }

    }
}
