
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class MaxNum {

    public static void maxNum(int[] a) {
        
        int base = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > base) {
                base = a[i];
            }
        }
    System.out.println("De todos estos numeros "+Arrays.toString(a)+" su maximo numero es "+base);
    }
    
    public static void main(String[] args){
         
        Scanner entrada=new Scanner(System.in);
        System.out.println("¿Cuantos numeros desea comparar?");
        int num=entrada.nextInt();
        int[] numA=new int[num];
        
        for(int i=0;i<num;i++){
            System.out.println("Digite numero "+(i+1));
            numA[i]=entrada.nextInt();
        }
        
        maxNum(numA);
    
    }    
}
