/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Diagnóstico;

import java.util.Stack;

/**
 *
 * @author braya
 */
public class Pila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack pila = new Stack();
        for (int i = 0; i < 10; i++) {
            pila.push(Integer.toString(i));
        }
        while (!pila.empty()){
            System.out.println(pila.pop());
        }
  
    }
    
}
