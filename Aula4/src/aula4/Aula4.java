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
public class Aula4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matrix = {
                    {1, 0, 1, 0},
                    {0, 1, 0, 0},
                    {0, 0, 1, 0},
                    {0, 0, 0, 1},
        };

        
//        matrixUtilities.show(matrix);
        
//        boolean isMatrix = matrixUtilities.isMatrix(matrix);
//        System.out.print(isMatrix);

        boolean isIdentity = matrixUtilities.isIdentity(matrix);
        System.out.print(isIdentity);

    }
    
}
