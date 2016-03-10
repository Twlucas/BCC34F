/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progapp;

import static progapp.ProgApp.soma;

/**
 *
 * @author Convidado
 */
public class ProgApp {
    
    public static int soma(int a, int b){
        return a+b;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int c=soma(1,1);
        System.out.println(c);
    }
    
}
