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

public class CharacterUtilities {

        /**
         *
         * @param value
         */
    static char lowerLetterSuccessorOf(char letter){
        
        char lowerSucc = letter;
        
        int auxiliar = (int) letter;
        auxiliar++;
        lowerSucc = (char) auxiliar;
        if (letter == 'z'){
            lowerSucc = 'a';
        }
        
        return lowerSucc;
            
    }
    
    static char lowerLetterPredecessorOf(char letter) {
        
        char lowerPred = letter;
        
        int auxiliar = (int) letter;
        auxiliar--;
        lowerPred = (char) auxiliar;
        if (letter == 'a'){
            lowerPred = 'z';
        }
        
        return lowerPred;
    }
    
    static char lowerLetterSuccessorStepsOf(char letter, int b){
 
        char lowerSucc = letter;
        
        int z = (int) 'z' ;
        int a = (int) 'a'; 
        int auxiliar = (int) letter;
        int let  = (int) letter;
        
        auxiliar+= b;
        if (auxiliar >= z){
            int times = auxiliar - z -1;
            auxiliar = a + times;
        }
        
        lowerSucc = (char) auxiliar;
        
        if(let == 32){
            lowerSucc=' ';
        }
        return lowerSucc;
            
    }
    
     static char lowerLetterPredecessorStepsOf(char letter, int b) {
        
        char lowerPred = letter;
        
        int z = (int) 'z' ;
        int a = (int) 'a'; 
        int auxiliar = (int) letter;
        int let  = (int) letter;
        
        
        if (auxiliar <= a){
            int times = let - auxiliar;
            auxiliar = (z + 1) - times;
        }
        auxiliar-= b;
        lowerPred = (char) auxiliar;
        if(let == 32){
            lowerPred=' ';
        }
        return lowerPred;
    }
    
     static int occurrencesOfCharacterIn(char[] array, char letter) {
        int occurrences = 0;
        for( int i = 0; i!=array.length; i++){
            if(array[i] == letter) occurrences++;
        }
        
        return occurrences;
    }
     
     static void  replaceCharacterIn(char[] array, char letter, char letterchange) {
        
        for( int i = 0; i!=array.length; i++){
            if(array[i] == letter){
                array[i] = letterchange;
            }
        }
        
//        return array;
     }
     
     static char[]  concatenationOf(char[] array, char[] array2) {
        int tamanho = array.length + array2.length;
        char[] arrayNew = new char[tamanho];
        
        for( int i = 0; i!=tamanho; i++){
            if(i< array.length){
                 arrayNew[i] = array[i];
            }else{
                arrayNew[i] = array2[i-array.length];
            }
        }
        
        return arrayNew;
    }
     
     static char[] copyOfPartOf(char[] array, int init, int end) {
        int tamanho = end - init +1;
        int index = 0;
        char[] arrayNew = new char[tamanho];
        for( int i = init; i<=end; i++){
            
            arrayNew[index] = array[i];
            index++;
            
        }
        return arrayNew;
    }
    
}