/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_4;

/**
 *
 * @author Turma A
 */
public class Aula_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] gradesPerCourse = {
           {14, 16},
           {12,18,20}
       };
       int numberOfGrades = 0;
       double sumOfGrades = 0.0;
       for (int course = 0; course != gradesPerCourse.length; course++) 
            for (int i= 0; i != gradesPerCourse[course].length; i++){
           sumOfGrades += gradesPerCourse[course][i];
           numberOfGrades++;
       }
       
       
       double averageOfGrades = sumOfGrades / numberOfGrades;
    
       //System.out.println(sumOfGrades); 
       //System.out.println(averageOfGrades);
        
        
        
        
        
        final int[] studentNumbers = {20032, 30312, 25342 , 31432};
        final String[] courseAcronyms = {"AD", "WEB-FE", "WEB-BE"};
        final int[][] studentGrades ={
            {15, 18, 17},
            {18, 10, 11},
            {11, 13, 15},
            {10, 19, 16}
        };
        int numeroAluno = 0;
        double maiorMedia =0;
        for (int i = 0; i != studentNumbers.length; i++) {
           int numero = studentNumbers[i]; 
           System.out.println();
           System.out.println("O aluno com o numero " + numero + ":"); 
           double soma = 0;
            for (int j = 0; j != studentGrades[i].length; j++) {
                System.out.println("    Na disciplina " + courseAcronyms[j] + "  teve  " + studentGrades[i][j]);
                soma += studentGrades[i][j];
            };
            double media = soma / courseAcronyms.length;
            System.out.println("        Teve a média " + media + ";");
                if (maiorMedia <= media){
                    maiorMedia = media ;
                    numeroAluno = numero;
                };
        };
        System.out.println();
         System.out.println("O aluno com o numero " + numeroAluno + " teve a maior media " + maiorMedia);
    }

}
    
   
