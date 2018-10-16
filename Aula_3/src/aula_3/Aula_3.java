/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_3;

/**
 *
 * @author Turma A
 */
public class Aula_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        char original = 'c';
//        int code = (int) original;
//        char recovered =(char) code;
//        
//        char letter= 'c';
//        letter++;
//        
//        System.out.println(original);
//        System.out.println(code);
//        System.out.println(recovered);
//        System.out.println(letter);

        
        
//        final int numberOfLetters = 'z' - 'a' + 1;
//        final char[] letters = new char[numberOfLetters];
//        for(int i=0; i != letters.length; i++)
//            letters[i] = (char) ('a' + i);
//        System.out.println(letters);


//        int number = 3;
//        increment(number);
//        System.out.println(number);
        
        int [] numbers = {1,2,3,4};
        incrementFirstOf(numbers);
        for (int i=0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
    
    public static void increment(int value){
        value ++;
        int x = 0;
    }
    
    public static void incrementFirstOf(final int[] values){
        values[0]++;
    }
    
}
