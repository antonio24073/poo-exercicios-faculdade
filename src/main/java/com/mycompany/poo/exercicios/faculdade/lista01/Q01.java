/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poo.exercicios.faculdade.lista01;

import java.util.Scanner;

/**
 *
 * @author Pc Dell
 */
public class Q01 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor A:");
        int a = sc.nextInt();
        System.out.print("Digite o valor B:");
        int b = sc.nextInt();
        sc.close(); 
        for (int i = (a+1); i < b; i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
    
}
