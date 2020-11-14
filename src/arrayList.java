
import java.util.ArrayList;
import java.util.Scanner;


public class arrayList {
  
  public static void main(String[] args){
      Scanner entrada=new Scanner(System.in);
      System.out.println("¿Cuantos estudiantes desea agregar al sistema?");
      int valGlobal=entrada.nextInt();
      ArrayList notas=new ArrayList();
      ArrayList carnet=new ArrayList();
      
        for(int i=0;i<valGlobal;++i){
            System.out.println("Ingrese el carnet del estudiante "+(i+1)+":");
            int valorCarnet=entrada.nextInt();
            carnet.add(valorCarnet);

            System.out.println("Ingrese la nota del estudiante con carnet "+carnet.get(i)+":");
            int valorNotas=entrada.nextInt();
            notas.add(valorNotas);          
        }
        System.out.println();
        for(int i=0;i<valGlobal;i++){
            System.out.println("Registro: "+(i+1)+" Carnet: "+carnet.get(i)+" Nota: "+notas.get(i));
        }

        System.out.println();        
        System.out.println("Seleccione una funcion:");        
        System.out.println("[1] Agregar nuevos datos.");
        System.out.println("[2] Eliminar datos existentes.");
        int funcion=entrada.nextInt();
        
        switch(funcion){
            case 1:
                System.out.println("¿Cuantos nuevos estudiantes desea agregar?");                
                int valor=entrada.nextInt();
                for(int i=valGlobal;i<valGlobal+valor;i++){
                System.out.println("Ingrese el carnet del estudiante "+(i+1)+":");
                int valorCarnet=entrada.nextInt();
                carnet.add(valorCarnet);

                System.out.println("Ingrese la nota del estudiante con carnet "+carnet.get(i)+":");
                int valorNotas=entrada.nextInt();
                notas.add(valorNotas);                
                }
                valGlobal=valGlobal+valor;
                for(int i=0;i<valGlobal;i++){
                    System.out.println("Registro: "+(i+1)+" Carnet: "+carnet.get(i)+" Nota: "+notas.get(i));
                }
                break;
            
            case 2:
                System.out.println("Estos son los registros existentes:");
                for(int i=0;i<valGlobal;i++){
                    System.out.println("Registro: "+(i+1)+" Carnet: "+carnet.get(i)+" Nota: "+notas.get(i));
                }                      
                
                System.out.println("¿Ingrese el numero de registro que desea eliminar?");
                valor=entrada.nextInt();
                carnet.remove(valor-1);
                notas.remove(valor-1);
                valGlobal=valGlobal-1;
                for(int i=0;i<valGlobal;i++){
                    System.out.println("Registro: "+(i+1)+" Carnet: "+carnet.get(i)+" Nota: "+notas.get(i));
                } 
               break;
        
            case 3:
                
        }
        
                
  }
}  