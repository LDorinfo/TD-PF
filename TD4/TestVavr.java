public class TestVavr{

    public static void main(String[] args){
        java.util.List<Integer> javaList = java.util.List.of(1,2,3);
        //javaList.add(4); // cela ne plante pas à la compilation or List.of est censé être immutable. 
        //A l'exécution j'aurais une exception.  

        java.util.List<Integer> javaListWrapper = Collections.unmodifiableList(new ArrayList<>()); //pareil il va crier à l'exécutuon. 

        List<Integer> vavrList= List
        
    }
}