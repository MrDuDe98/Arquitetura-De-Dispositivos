/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3;

/**
 *
 * @author Turma A
 */
public class Aula3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        char letterChange = 'b';
        char letter ='a';
        char[] letters = {'a', 'b','c','d','a','f','a'};
        char[] array = {'b','a','b','a','d','o'};
        int times = 3;
        int init = 2;
        int end = 5;
        String a = "cifra de cesar"; 
        
        
//        char lowerSucc = CharacterUtilities.lowerLetterSuccessorOf(letter);
//          System.out.println(lowerSucc);


//        char lowerPred = CharacterUtilities.lowerLetterPredecessorOf(letter);
//          System.out.println(lowerPred);


//        char lowerSuccSteps = CharacterUtilities.lowerLetterSuccessorStepsOf(letter, times);
//          System.out.println(lowerSuccSteps);


//        char lowerPredSteps = CharacterUtilities.lowerLetterPredecessorStepsOf(letter, times);
//          System.out.println(lowerPredSteps);


//        int occurence = CharacterUtilities.occurrencesOfCharacterIn(letters , letter);
//          System.out.println(occurence);


//         CharacterUtilities.replaceCharacterIn(letters, letter, letterChange);
//          System.out.println(letters);


//        char[] concatenation = CharacterUtilities.concatenationOf(letters , array);
//         System.out.println(concatenation);

//        char[] copy = CharacterUtilities.copyOfPartOf(letters , init, end);
//         System.out.println(copy);
//            System.out.println((int) '#');
           String cipher = CaesarCipherDecipherer.cipher(a, times);
           System.out.println(cipher);
           
           String decipher = CaesarCipherDecipherer.decipher(cipher, times);
           System.out.println(decipher);
       
    }

}

