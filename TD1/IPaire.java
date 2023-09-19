public interface IPaire<T,U>{
    T fst(); // avoir le premier élément de la paire
    U snd(); //avoir le second élément de la paire 
    <V> IPaire<V,U> changeFst(V v); //retourne la nouvelle paire où le 1er élément a été changé
    <V> IPaire<T,V> changeSnd(V v); // retourne une nouvelle paire où le second élément a été changé. 
    //permet de faire une variable locale. 
}