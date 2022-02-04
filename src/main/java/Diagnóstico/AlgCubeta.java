/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Diagnóstico;

/**
 *
 * @author braya
 */
public class AlgCubeta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A[]={1, 2, 3 , 7, 20, 4, 2, 1};
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
        System.out.println("-----------------------");
        seleccion(A);
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
    }
    
    public static void seleccion(int A[]) {
        
          int menor, pos, tmp;
          for (int i = 0; i < A.length - 1; i++) {      // tomamos como menor el primero
                menor = A[i];                       // de los elementos que quedan por ordenar                    
                pos = i;                            // y guardamos su posición
                for (int j = i + 1; j < A.length; j++){ // buscamos en el resto
                      if (A[j] < menor) {           // del array algún elemento
                          menor = A[j];             // menor que el actual
                          pos = j;
                      }
                }
                if (pos != i){                      // si hay alguno menor se intercambia                         
                    tmp = A[i];
                    A[i] = A[pos];
                    A[pos] = tmp;
                }
          }
}
}
