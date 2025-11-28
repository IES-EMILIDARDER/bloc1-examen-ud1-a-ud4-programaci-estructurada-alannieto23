package PROVA;

import java.util.ArrayList;

public class EX_4 {
    public static void main(String[] args) {
          // 'array' de 5 posicions amb valors aleatoris entre 0 i 9
         // 'arraylist' resultant
        
        // Genera un array de 10 posicions amb números aleatoris entre 0 i 9
        int[] array = UtilExamen.generaArray(10, 0, 9);
        int[] array1 = UtilExamen.generaArray(10, 0, 9);
        
        // Calcula l''ArrayList' emprant el mètode 'obteRepetitsOrdenat'
        //   NOTA: el mètode 'obteRepetitsOrdenat' pot servir-se dels mètodes anteriors:
        //         'obteRepetits' -> 'arrayListToArray' -> 'ordenaArray'
        ArrayList<Integer> resultat = UtilExamen.obteRepetitsOrdenat(array, array1);
        
        // Mostra l''ArrayList' resultant
        UtilExamen.mostraArray(array);
        
        UtilExamen.mostraArray(array1);
        
        System.out.println(resultat);
    }
}

