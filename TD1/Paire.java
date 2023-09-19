public class Paire<A, B> implements IPaire<A, B>{

    private A _fst; 
    private B _snd;  

    public Paire (A a, B b){
        this._fst= a; 
        this._snd= b; 
    }
    @Override public A fst(){
        // avoir le premier élément de la paire
        return _fst;
    } 
    @Override public B snd(){
        return _snd; 
    } //_fstvoir le second élément de l_fst p_fstire 
    @Override public <V>IPaire<V,B> changeFst(V v){
        return new Paire<>(v,_snd);
    } //retourne la nouvelle paire où le 1er élément a été changé
    @Override public <V>IPaire<A,V> changeSnd(V v){
        return new Paire<>(_fst, v);
    } // retourne une nouvelle paire où le second élément a été changé. 
    //permet de faire une variable locale. 

    public String toString(){
        return String.format(format:"(%s,%s):: Paire[%s,%s]",_fst,_snd,_fst.getClass().getSimpleName(), _snd.getClass().getSimpleName() );
    }
}
