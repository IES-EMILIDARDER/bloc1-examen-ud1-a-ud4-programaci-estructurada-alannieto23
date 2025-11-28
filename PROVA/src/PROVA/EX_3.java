package PROVA;

import java.util.ArrayList;

public class EX_3 {
    public static void main(String[] args) {
         // 'array' de 5 posicions amb valors aleatoris entre 0 i 9
          // 'arraylist' resultant
        
        // Genera un array de 10 posicions amb números aleatoris entre 0 i 9
        int[] array = UtilExamen.generaArray(10, 0, 9);
        // Calcula l''ArrayList' emprant el mètode 'ordenaArray' 
        ArrayList<Integer> resultat = UtilExamen.ordenaArray(array);
        // Mostra l''ArrayList' resultant
        UtilExamen.mostraArray(array);
        System.out.println(resultat);
    }
}

