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
public class CaesarCipherDecipherer {
    
    static String cipher(String str, int a){
        String ciphered="";
        for( int i = 0; i!=str.length(); i++){ 
            char cipher = CharacterUtilities.lowerLetterSuccessorStepsOf(str.charAt(i), a);
            ciphered+= cipher;
        }
      return ciphered;
    }
    
    static String decipher(String str, int a){
        String deciphered ="";
        for( int i = 0; i!=str.length(); i++){ 
            char decipher = CharacterUtilities.lowerLetterPredecessorStepsOf(str.charAt(i), a);
            
              deciphered+= decipher;  
            
        }
      return deciphered;
    }
}
