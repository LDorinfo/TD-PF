public class Entier implements Sommable<Entier>{
    // car c'est l'entier qui est sommable. 
    private Integer n; 
    public Entier( Integer n){
        this.n= n; 
    }
    public Integer getN(){
        return n; 
    }
    @Override public Entier sommer(Entier v){
        Integer i = v.getN() + this.valeur ; 
        return new Entier(i); 
    }
}