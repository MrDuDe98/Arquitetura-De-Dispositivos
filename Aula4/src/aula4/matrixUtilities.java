/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4;

/**
 *
 * @author Turma A
 */
public class matrixUtilities {

    static void show(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            };
            System.out.println();
        };
    };

    static boolean isMatrix(int[][] matrix) {
        boolean answer = true;
        int column = matrix[0].length;        
        for (int i = 1; i < matrix.length; i++) {
            if(column != matrix[i].length){
                answer = false;
                break;
            };
            
        };                       
        return answer;
    };

    static boolean isIdentity(int[][] matrix) {
        boolean answer = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {                
                if(i == j){
                    if(matrix[i][j] !=1){
                    answer = false;    
                    };
                }else{
                  if(matrix[i][j]!=0){
                    answer = false; 
                  };  
                }; 
            };
        };
    return answer;
    };
    
    
    
    
}
