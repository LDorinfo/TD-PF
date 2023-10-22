import java.util.List;

public class Commande {

    private Client c; 
    private  List<Ligne> ls; 

    public Commande(Client c){
        this.c = c; 
    }

    public void ajouter(Produit p, int quantite){
        ls.add(new Ligne(p,quantite)); 
    }
}
