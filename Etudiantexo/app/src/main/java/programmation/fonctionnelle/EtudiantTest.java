package programmation.fonctionnelle;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Map;
import java.util.Optional;
import java.util.Set;


public class EtudiantTest{
    @Test public void testMoyenneOK(){
        Optional<Etudiant> oe= Etudiant.createEtudiant1(Set.of("PF", "MAPC"), "001", Map.of("PF",10.0, "MAPC", 12.0)); 
        assertTrue(oe.isPresent()); 
        Etudiant e = oe.get(); 
        Optional<Double> om = e.moyenne(); 
        assertTure(om.isPresent()); 
        assertEquals(om.get(), (Double)11.0); 
    }

    @Test public void testmoyenne2(){
        Optional<Etudiant> oe= Etudiant.createEtudiant1(Set.of("PF", "MAPC"), "001", Map.of("PF",10.0, "MAPC", 12.0)); 
        assertTrue(oe.isPresent()); 
        Etudiant e = oe.get(); 
        Optional<Double> om = e.moyenne(); 
        assertTrue(om.isPresent()); 
        assertEquals(om.get(), (Double)11.0); 
    }
}