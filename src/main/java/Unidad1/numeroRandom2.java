/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Unidad1;

/**
 *
 * @author braya
 */
public class numeroRandom2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int s=5;
        int a=81;
        int m=100;
        int numeroRandom;
        for (int i = 0; i < 10; i++) {
            numeroRandom = numeroRandom(s, a, m);
            s = numeroRandom;
            //int ns = 0;
            System.out.println(numeroRandom);
        }
        
//        while(numeroRandom != s) {
//            numeroRandom = numeroRandom(ns, a, m);
//            ns = numeroRandom;
//            System.out.println(numeroRandom);
//        }
        
    }
    
    public static int numeroRandom(int s, int a, int m){
      
        int n = (a*s)%m;
        return n;
    }
}
