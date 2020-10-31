
import java.util.Scanner;

public class Prueba {

    public static void maxNum(int[] a) {
        
        int base = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > base) {
                base = a[i];
            }
        }
    System.out.println("El numero maximo es "+base);
    }
    
    public static void main(String[] args){
         
        Scanner entrada=new Scanner(System.in);
        System.out.println("¿Cuantos numeros desea comparar?");
        int num=entrada.nextInt();
        int[] numA=new int[num];
        int a;
        for(int i=0;i<num;i++){
            System.out.println("Digite numero "+(i+1));
            numA[i]=entrada.nextInt();
        }
        
        maxNum(numA);
    
    }

}
