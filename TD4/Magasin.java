import java.util.*;

public class Magasin {
    private Double seuil; 
    private List<Commande> cs; 
    private Set<Client> cls; 

    public Magasin(Double seuil){
        this.seuil= seuil; 
    }

    public double seuil(){
        return seuil; 
    }

    public Commande créerCommande(Client c){
        if(cls.contains(c)){
            Commande cde = new Commande(c); 
            cs.add(cde); 

        }
    }
    public Set<Commande> commandeExtra(){
        return cs.stream(). 
    }
    public Set<Client> mavaisClients(){
        return cls.stream().filter(c-> c.premium()
        && cs.stream().noneMatch(cde-> cde.client.equals(c))).collect(Collectors.toSet()); s
    }
}