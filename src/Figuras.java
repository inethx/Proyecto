
import java.util.Scanner;


public class Figuras {

    public static int areaCuadrado(int lado){
        int resultado = lado*lado;
        System.out.println("El area de un cuadrado es: "+resultado);
        return resultado;
    }
    
    public static int areaRectangulo(int largo, int ancho){
        int resultado = largo*ancho;
        System.out.println("El area de un rectangulo es: "+resultado);    
        return resultado;
    }
    
    public static double areaCirculo(double radio){
        double pi=3.1416;        
        double resultado= pi*Math.pow(radio, 2);
        System.out.println("El area de un circulo es: "+resultado);
        return radio;
    }
    public static int figura(int opcion){
        double circular;
        int cuadrado, rectangulo;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingresa la opcion deseada");
        System.out.println("1: Cuadrado\n2: Rectangulo\n3: Circulo");        
        opcion = entrada.nextInt();
        return opcion;
    }
    
    
    public static void main(String[] args){
        Scanner entrada=new Scanner(System.in);
        int i=0;
        
        while(i==0){
        int opcion=0;
        int num=figura(opcion);
        
        
        switch(num){
            case 1:
                int lado;
                String pregunta;
                System.out.println("¿Cuanto mide un lado del cuadrado?");
                lado=entrada.nextInt();
                areaCuadrado(lado);
                System.out.println("¿Desea ejecutar otra vez el programa?");
                pregunta=entrada.next();
                if(pregunta.equals("no")){
                    i--;
                }
                break;
            case 2:
                int largo;
                System.out.println("¿Cuanto mide el largo del rectangulo?");
                largo=entrada.nextInt();
                int ancho;
                System.out.println("¿Cuanto mide el ancho del rectangulo?");                
                ancho=entrada.nextInt();
                areaRectangulo(largo, ancho);
                System.out.println("¿Desea ejecutar otra vez el programa?");
                pregunta=entrada.next();
                if(pregunta.equals("no")){
                    i--;
                }
                break;
            case 3:
                double radio;
                System.out.println("¿Cuanto mide el radio del circulo?");
                radio=entrada.nextDouble();
                areaCirculo(radio);
                System.out.println("¿Desea ejecutar otra vez el programa?");
                pregunta=entrada.next();
                if(pregunta.equals("no")){
                    i--;
                }
                break;
            default:
                System.out.println("No existe esa figura geometrica");
        }
        }
        
    }
}
