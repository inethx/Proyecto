package Proyecto2.UnirVectores;

import java.util.Arrays;

public class UnionVector {

    int[] vector1;
    int[] vector2;
    int[] vectorUnido;

    public UnionVector() {

    }

    public UnionVector(int[] vector1, int[] vector2) {
        this.vector1 = vector1;
        this.vector2 = vector2;
    }

    public void unirVector(){
        vectorUnido=new int[vector1.length+vector2.length];
        for(int i=0;i<vector1.length;i++){
            vectorUnido[i]=vector1[i];
        }
        for(int i=0;i<vector1.length;i++){
            vectorUnido[i]=vector1[i];
        }
        for(int i=vector1.length;i<(vector1.length+vector2.length);i++){
            vectorUnido[i]=vector2[i-vector1.length];
        }
    }
    
        public void ordenarVector(){
            Arrays.sort(vectorUnido);        
    }
    
    public void mostrarVector(){
            System.out.println("Su vector combinada serïa:");
        
        for(int i=0;i<vectorUnido.length;i++){
            System.out.print("["+vectorUnido[i]+"] ");
        }
                System.out.println();

    }
    
    public int[] getVector1() {
        return vector1;
    }

    public void setVector1(int[] vecto1) {
        this.vector1 = vector1;
    }

    public int[] getVector2() {
        return vector2;
    }

    public void setVector2(int[] vector2) {
        this.vector2 = vector2;
    }

}
