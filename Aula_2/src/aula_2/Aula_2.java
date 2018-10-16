/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_2;

import java.util.Arrays;

/**
 *
 * @author Turma A
 */
public class Aula_2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        //int numElevado = NumericalUtilities.powerOf(2,3);
        //System.out.println(numElevado);
        
        //int somaNatural = NumericalUtilities.sumOfNaturalNumbersUpTo(3);
        // System.out.println(somaNatural);
        
       // int somaNaturalEntre = NumericalUtilities.sumOfNaturalNumbersBetween(2,3);
         //System.out.println(somaNaturalEntre);
         
       // int somaNumerosPares = NumericalUtilities.sumOfEvenNumbersBetween(2,4);
        // System.out.println(somaNumerosPares);
        
       // int numerosDivisores = NumericalUtilities.numbersOfDivisorsOf(4);
         //System.out.println(numerosDivisores);
         
         //String numerosPrimos = NumericalUtilities.isPrime(4);
         //System.out.println(numerosPrimos);
         
         // ARRAYS-------- (3)
         
         int[] array = {1,2,3,1,5,6,1,8,9,10};
         int numero = 3;
         int valorAdd = 8;
         int valorRemover = 0;

         //String str = ArrayUtilities.toString(array);
         //System.out.println(str);
         
         //int maximoStr = ArrayUtilities.maximumOf(array);
         //System.out.println(maximoStr);
         
         //int minimoStr = ArrayUtilities.minimumOf(array);
         //System.out.println(minimoStr);
         
         //int [] copia = ArrayUtilities.copyOf(array);
         //System.out.println(Arrays.toString(copia));
         
         //boolean contain = ArrayUtilities.contains(array, numero);
         //System.out.println(contain);
         
         //boolean containDuplicate = ArrayUtilities.containsDuplicates(array);
         //System.out.println(containDuplicate);
         
         //int index = ArrayUtilities.indexOf(array, numero);
         //System.out.println(index);
         
         //int [] adiciona = ArrayUtilities.add(array, valorAdd);
         //System.out.println(Arrays.toString(adiciona));
         
         int [] remover = ArrayUtilities.remove(array, valorRemover);
         System.out.println(Arrays.toString(remover));
    }
     
}
