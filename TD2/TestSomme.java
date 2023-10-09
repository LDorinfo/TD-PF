import java.util.Collection;
import java.util.Iterator;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class TestSomme{
    
    public static final <T> Optional<T> reducteur(Collection<T> xs, Somme<T> f){
        /*T dep = xs.get(0); 
        for(int i=1; 1<xs.size(); i++){
            dep = f.somme(dep, xs.get(i)); 
        }
        return dep; 
        */
        
        if(xs.isEmpty()){
            // est ce que l'élément itérable est null? 
            return null; 
        } else {
            return xs.stream().reduce(f::somme); 
        }
        // return (xs.isEmpty())? Optional.empty() : xs.stream().reduce(f::somme); 
    }
    public static <T> ToString<List<T>> repr1(){
        return xs->{
            String.format("[%s]", xs.stream() //stream<T>
            .map(T::toString) //Stream<String>
            .collect(Collectors.joining("[",",","]"))); //String
        }; 
    }
    public static <K,V> ToString<Map<K,V>> repr2(){
        return es-> String.format("{%s}",es.entrySet().stream()//Stream(EntrySet<K,V>)
        .map(e-> String.format("%s","%s",e.getKey(), e.getValue()))
        .collect(Collectors.collect(Collectors.joining("[",",","]")))); //String
));

    }

    public static void main(String[] argv){
        //on définit apply ici
        Function<Integer,Integer> f1 = x-> x+1; 
        //on définit apply ici
        BiFunction<Integer,Integer,Integer> f2 = (x,y)-> x+y; 
        // on definit apply 
        BinaryOperator<Integer> f3 =(x,y)->x+y ; 
        //on utilise apply 
        System.out.println(f2.apply(3,4));

        Somme<Double> sommeDouble = (d1,d2)->d1+d2;
        System.out.println(sommeDouble.somme(1.2,4.0));
        
        
        Somme<Integer> sommeInteger = (d1,d2)->d1+d2;
        System.out.println(sommeInteger.somme(3,4));

        Somme<String> sommeString = (d1,d2)->d1+d2;
        System.out.println(sommeString.somme("Je t'aime"," pas"));

        List<Integer> l1 = List.of(3,2,4,5); 
        System.out.println(reducteur(l1, sommeInteger)); 
        
        //question 2. 
        Map<String, Integer> notes = Map.of(
            "001",10,
            "002",12,
            "003", 16
        ); 
        
        ToString<Map<String>> reprM= null; 

        System.out.println(reprLS.repr(12)); 

    }
}