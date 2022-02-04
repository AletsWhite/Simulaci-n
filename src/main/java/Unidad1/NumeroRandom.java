/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Unidad1;

/**
 *
 * @author braya
 */
public class NumeroRandom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int s=4;
        int a=5;
        int ca=7;
        int m=8;
        int numeroRandom;
//        numeroRandom = numeroRandom(s, a, ca, m);
//        int ns = numeroRandom;
//        System.out.println(numeroRandom);
        for (int i = 0; i < 10; i++) {
            numeroRandom = numeroRandom(s, a, ca, m);
            s = numeroRandom;
            //int ns = 0;
            System.out.println(numeroRandom);
        }
//        while(numeroRandom != s) {
//            numeroRandom = numeroRandom(ns, a, ca, m);
//            ns = numeroRandom;
//            System.out.println(numeroRandom);
//        }
           
    }
    
    public static int numeroRandom(int s, int a, int ca, int m){
        int n = (a*s+ca)%m;
        return n;
    }
    
    
    
}
