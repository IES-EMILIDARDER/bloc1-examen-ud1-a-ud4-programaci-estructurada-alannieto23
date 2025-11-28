package PROVA;

import java.util.ArrayList;

public class UtilExamen {

    public static int[] generaArray(int longitud, int minim, int maxim) {
        int[] array = new int[longitud];

        for (int i = 0; i < array.length; i++) {
            array[i] = minim + (int) (Math.random() * (maxim - minim + 1));
        }
        return array;
    }

    public static void mostraArray(int[] array) {
        String separador = "";
        System.out.print('[');

        for (int i = 0; i < array.length; i++) {
            System.out.print(separador + array[i]);
            separador = ", ";
        }
        System.out.println(']');

    }

    public static int[] ArrayListToArray(ArrayList<Integer> ArrayL) {
        int array[] = new int[ArrayL.size()];

        for (int i = 0; i < ArrayL.size(); i++) {
            array[i] = ArrayL.get(i);
        }
        return array;
    }

    public static ArrayList<Integer> quitarRepetidoDosArray(int[] array, int[] arrayUno) {
        ArrayList<Integer> resultado = new ArrayList<>();

        for (int i : array) {
            boolean trobat = false;
            for (int k : resultado) {
                if (i == k) {
                    trobat = true;
                    break;
                }
            }
            if (!trobat) {
                resultado.add(i);
            }

        }
        for (int j : arrayUno) {
            boolean trobat = false;
            for (int k : resultado) {
                if (j == k) {
                    trobat = true;
                    break;
                }
            }
            if (!trobat) {
                resultado.add(j);
            }
        }
        return resultado;
    }

    //Buscar coincidencias entre la array generada y un grupo, quitando los repetidos
    public static ArrayList<Integer> comparArrayQuitarRepetido(int[] numero, int[] grupo) {
        ArrayList<Integer> pares = new ArrayList<>();
        for (int i = 0; i < numero.length; i++) {
            for (int j = 0; j < grupo.length; j++) {
                if (numero[i] == grupo[j]) {

                    boolean existe = false;
                    for (int k = 0; k < pares.size(); k++) {
                        if (pares.get(k) == numero[i]) {
                            existe = true;
                            break;
                        }
                    }
                    if (!existe) {
                        pares.add(numero[i]);
                    }

                    break;
                }
            }
        }

        return pares;
    }

    public static ArrayList<Integer> ordenaArraySinRepe(int[] array) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            boolean repetido = false;

            for (int j = 0; j < arrayList.size(); j++) {
                if (array[i] == arrayList.get(j)) {
                    repetido = true;
                    break;
                }
            }

            if (!repetido) {

                boolean insertado = false;
                for (int j = 0; j < arrayList.size(); j++) {
                    if (array[i] < arrayList.get(j)) {
                        arrayList.add(j, array[i]);
                        insertado = true;
                        break;
                    }
                }
                if (!insertado) {

                    arrayList.add(array[i]);
                }
            }
        }

        return arrayList;
    }

    public static ArrayList<Integer> ordenaArray(int[] array) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {

            boolean insertado = false;

            for (int j = 0; j < arrayList.size(); j++) {
                if (array[i] < arrayList.get(j)) {
                    arrayList.add(j, array[i]);
                    insertado = true;
                    break;
                }
            }
            if (!insertado) {
                arrayList.add(array[i]);
            }
        }
        return arrayList;
    }

    public static ArrayList<Integer> incluirIguales(int[] numero, int[] grupo) {
        ArrayList<Integer> pares = new ArrayList<>();
        for (int i : numero) {
            for (int j : grupo) {

                if (i == j) {
                    pares.add(i);
                    break;
                }
            }

        }
        return pares;
    }

    public static ArrayList<Integer> obteRepetitsOrdenat(int[] numero, int[] grupo) {
        return (ordenaArray(ArrayListToArray(incluirIguales(numero, grupo))));
    }

    public static ArrayList<Integer> arrayToArrayList(int[] array) {
        ArrayList<Integer> pares = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {

            pares.add(array[i]);

        }
        return pares;
    }

    public static void mostraArrayListInt(ArrayList<Integer> ArrayL) {

        for (int i = 0; i < ArrayL.size(); i++) {
            System.out.print(ArrayL.get(i));
        }
        System.out.println();
    }

}
