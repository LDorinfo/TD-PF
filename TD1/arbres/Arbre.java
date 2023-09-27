package td1.arbres;

import java.util.Set;

public interface Arbre<T> {
    int taille();
    boolean contient(final T val);
    Set<T> valeurs();
    T somme();
    Integer min();
    Integer max();
    boolean estTrie();
}