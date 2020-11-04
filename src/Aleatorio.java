
import java.util.Scanner;


public class Aleatorio {

  private static int[] Aleatorio(int[] arreglo) {

    for(int i = arreglo.length - 1; i > 0; i--) {

      int num2 = (int)Math.floor(Math.random() * (i + 1));
      int numero = arreglo[i];      
      arreglo[i] = arreglo[num2];
      arreglo[num2] = numero;
    }
    return arreglo;
  }


  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int base;

    System.out.println("¿Cuantos numeros desea hacer el ramdom?");
    base = entrada.nextInt();
    int[] arreglo=new int[base];

    for(int i=0;i<base;i++){
        System.out.println("¿Digite el numero "+(i+1)+"?");
        arreglo[i] = entrada.nextInt();
    }
    int[] metodo = Aleatorio(arreglo);
   
    System.out.println("Sus numeros aleatorios son:");       
    for (int i = 0, j = metodo.length; i < j; i++) {
      System.out.println(metodo[i]);
    }
  }    
}
