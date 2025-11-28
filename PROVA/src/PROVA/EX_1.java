package PROVA;

import java.util.ArrayList;


public class EX_1 {
    public static void main(String[] args) {
          // 'array' de 5 posicions amb valors aleatoris entre 0 i 9
          // 'arraylist' resultant
        
        // Crea un 'Array' de 5 posicions amb números aleatoris entre 0 i 9
        int[] array = UtilExamen.generaArray(5, 0, 9);
        // Calcula l''ArrayList' emprant el mètode 'arrayToArrayList' 
        ArrayList<Integer> arrayL = UtilExamen.arrayToArrayList(array);
        
        int[]array1 = UtilExamen.ArrayListToArray(arrayL);
        // Mostra l''ArrayList' resultat emprant el mètode 'mostraArrayListInt' 
        UtilExamen.mostraArray(array);
        
        //Ense?ar ArrayList
        UtilExamen.mostraArrayListInt(arrayL);
        
        //Ense?ar el nuevo array que viene  del ArrayList
        UtilExamen.mostraArray(array1);
        
        
    }
}

