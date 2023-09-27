public class Chaine implements Sommable<String>{

    private String s;
    
    public Chaine(String c){
        s=c; 
    }
    public String getChaine(){
        return s; 
    }
    @Override public Chaine sommer(Chaine c){
        return this.getChaine()+c.getChaine(); 
    }
}