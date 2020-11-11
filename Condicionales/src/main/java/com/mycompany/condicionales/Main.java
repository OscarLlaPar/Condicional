/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.condicionales;

import java.util.Scanner;

/**
 *
 * @author Oscar Llamas Parra
 */
public class Main {
    private static int n;//Número a introducir
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduzca número entero");
        Scanner type = new Scanner(System.in);
        n=type.nextInt();
        
        if(n%2==0){
            System.out.println("PAR");
        }
        else{
            System.out.println("IMPAR");
        }
    }
    
}
