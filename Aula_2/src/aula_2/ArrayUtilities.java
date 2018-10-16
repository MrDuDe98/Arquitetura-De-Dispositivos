/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_2;

/**
 *
 * @author Turma A
 */
public class ArrayUtilities {

    static String toString(int[] array) {
        String str = " ";
        for (int i = 0; i < array.length; i++) {
            str = str + array[i];
        }
        return str;
    }

    static int maximumOf(int[] array) {
        int resultado = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > resultado) {
                resultado = array[i];
            }
        }
        return resultado;
    }

    static int minimumOf(int[] array) {
        int resultado = array[0];
        for (int i = 1; i > array.length; i++) {
            if (array[i] < resultado) {
                resultado = array[i];
            }
        }
        return resultado;
    }

    static int[] copyOf(int[] array) {
        int[] copia = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copia[i] = array[i];
        }
        return copia;
    }

    static boolean contains(int[] array, int numero) {
        boolean resposta = false;
        for (int i = 0; i != array.length; i++) {
            if (array[i] == numero) {
                resposta = true;
            }
        }
        return resposta;
    }

    static boolean containsDuplicates(int[] array) {
        boolean resposta = false;
        for (int i = 0; i != array.length; i++) {
            for (int i0 = 0; i0 != array.length; i0++) {
                if (i0 != i && array[i] == array[i0]) {
                    resposta = true;
                }
            }
        }
        return resposta;
    }

    static int indexOf(int[] array, int numero) {

        for (int i = 0; i != array.length; i++) {
            if (array[i] == numero) {
                return i;
            }
        }
        return -1;
    }

    static int[] add(int[] array, int valorAdd) {
        int[] copia = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            copia[i] = array[i];
        }
        copia[copia.length - 1] = valorAdd;
        return copia;
    }

    static int[] remove(int[] array, int numero) {
        int[] result;
        boolean contains = contains(array, numero);
        if (contains) {
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                if(numero == array[i])
                    count++;
            }
            result = new int[array.length-count];
            
            count = 0;
            for (int i=0; i < result.length; i++){
                while(numero == array[count]){
                    count++;
                }
                result[i]=array[count];
                count++;
            }
        } else {
            return array;
        }
        
        return result;
    }
    
    

}
