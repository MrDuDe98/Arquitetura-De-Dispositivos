/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and
open the template in the editor.
 */
package Aula1;

/**
 *
 * @author Turma A
 */
public class Aula1 {
    
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

         System.out.println("Hello World");
         
   
    double Perimeter = RectanglePerimeter(2,4);
    double Volume = ParaVolume(3,14,12);
    double Temp = TempCelc(45);
    int Tempo = TempoSec(1,1,1);
    int [] SequenciaNum = {1,2,3,4,5,6,7,8,9,10};
    double Max = Maximo(SequenciaNum);
    double Min = Minimo(SequenciaNum);
    double Med = Media(SequenciaNum);
   
        System.out.println(Perimeter);
        System.out.println(Volume);
        System.out.println(Temp);
        System.out.println(Tempo);
        System.out.println(Max);
        System.out.println(Min);
        System.out.println(Med);
    }

  
  public static double RectanglePerimeter(int sideA, int sideB) {
         
        return sideA*2 + sideB*2 ;
    }

    private static double ParaVolume(int sideA, int sideB, int sideC) {
        return sideA * sideB * sideC;
    }

    private static double TempCelc(int i) {
        return ((i-32.0)*(5.0/9.0));
    }

    private static int TempoSec(int hora, int minuto, int segundo) {
        return hora*3600 + minuto * 60 + segundo;
    }

    private static double Maximo(int[] SequenciaNum) {
        int max = 0 ;
        for(int i= 0; i < SequenciaNum.length ; i++){
            if (SequenciaNum[i] > max ){ max= SequenciaNum[i];}
        }
        return max;
    }

    private static double Minimo(int[] SequenciaNum) {
        double min = Double.POSITIVE_INFINITY ;
        for(int i= 0; i < SequenciaNum.length ; i++){
            if (SequenciaNum[i] < min ){ min= SequenciaNum[i];}
        }
        return min;
    }
    
    private static double Media(int[] SequenciaNum) {
       double total= 0;
       for(int i= 0; i < SequenciaNum.length ; i++){
            total = total + SequenciaNum[i];
       
        }
       return total / SequenciaNum.length;
    }

    
}

