package programmation.fonctionnelle;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

import io.vavr.control.Either; 
public class Etudiant{
    private String id; 
    private Map<String,Double> notes; 
    private Etudiant(String id, Map<String,Double> notes){
        this.id=id; 
        this.notes= notes; 
    }

    public static final Optional<Etudiant> createEtudiant1(Set<String> matieres, String id, Map<String,Double> notes){
        if(id == null || id.isEmpty()) 
            return Optional.empty(); 
        if(notes==null)
            return Optional.empty(); 
        if(!notes.keySet().equals(matieres))
            return Optional.empty(); 
        return Optional.of(new Etudiant(id,notes)); 

    }

    public static final Either<String,Etudiant> createEtudiant2(Set<String> matieres, String id, Map<String,Double> notes){
         if(id == null || id.isEmpty()) 
            return Either.left("Pb id"); 
        if(notes==null)
            return Either.left("Pb null"); 
        if(!notes.keySet().equals(matieres))
            return Either.left("pb matiere"); 
        return Either.right(new Etudiant(id,notes)); 
    }
    public Optional<Double> moyenne(){
        return notes.values().stream().reduce(Double::sum).map(m-> m/notes.size()); 
    }
}