package td1.arbres;

import java.util.Set;

public class Feuille<T> implements Arbre<T> {

    private final T valeur;

    public Feuille(final T valeur) {
        this.valeur = valeur;
    }

    @Override
    public int taille() {
        return 1;
    }

    @Override
    public boolean contient(final T val) {
        return val.equals(valeur);// pas == car il va utiliser l'égalité d'objet qui aurait marché avec des int.
    }

    @Override
    public Set<T> valeurs() {
        return Set.of(valeur);
    }

    @Override
    public T somme() {
        return valeur;
    }

    @Override
    public Integer min() {
        return valeur;
    }

    @Override
    public Integer max() {
        return valeur;
    }

    /**
     * une feuille est toujours triée.
     */
    @Override
    public boolean estTrie() {
        return true;
    }
    
}