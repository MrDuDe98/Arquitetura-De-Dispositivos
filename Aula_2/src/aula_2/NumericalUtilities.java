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
public class NumericalUtilities {

    /**
     * Esta funçao calcula o valor expoente de uma base
     *
     * @param base
     * @param potencia
     * @return retorna o resultado da funçao powerOF
     */
    static int powerOf(int base, int potencia) {
        int pow = 1;

        for (int i = 0; i < potencia; i++) {
            pow *= base;
        }
        return pow;
    }

    static int sumOfNaturalNumbersUpTo(int num) {
        int soma = 0;
        for (int i = 0; i <= num; i++) {
            soma = soma + i;
        }
        return soma;
    }

    static int sumOfNaturalNumbersBetween(int numeroUm, int numeroDois) {
        int soma = 0;
        for (int i = numeroUm; i <= numeroDois; i++) {
            soma = soma + 1;
        }
        return soma;
    }

    static int sumOfEvenNumbersBetween(int numeroMin, int numeroMax) {
        int resultado = 0;
        for (int i = 0; i <= numeroMax; i++) {
            if (i >= 0) {
                resultado = resultado + 1;
            }
        }
        return resultado;
    }

    static int numbersOfDivisorsOf(int divisor) {
        int resultado = 0;
        for (int i = 1; i <= divisor; i++) {
            if (divisor % i == 0) {
                resultado = resultado + 1;
            }
        }
        return resultado;
    }

    static String isPrime(int primo) {
      int resultado = 0;
      for (int i = 1; i <= primo; i++) {
            if (primo % i == 0) {
                resultado = resultado + 1;
            }
        }
      if (resultado == 2){
                return "numero é primo";
                
            }else 
                return "Numero nao é primo";
    }

}
