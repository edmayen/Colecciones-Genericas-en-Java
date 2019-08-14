/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejocoleccionesgenericas;
import java.util.*;

/**
 *
 * @author edmayen
 */
public class ManejoColeccionesGenericas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> miLista=new ArrayList<>();
        miLista.add("1");
        miLista.add("2");
        miLista.add("3");
        miLista.add("4");
        miLista.add("4");
        imprimir(miLista);
        
        Set<String> miSet=new HashSet<>();
        miSet.add("11");
        miSet.add("22");
        miSet.add("33");
        miSet.add("44");
        imprimir(miSet);
        
        Map<String, String> miMapa=new HashMap<>();
        miMapa.put("1","Jose");
        miMapa.put("2", "Juan");
        miMapa.put("3", "Rosario");
        miMapa.put("4", "Jose");
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
        
    }
    
    static void imprimir(Collection<String> col)
    {
        col.forEach((elemento) -> {
            System.out.println(elemento+" ");
        });
        System.out.println();
    }
    
}
