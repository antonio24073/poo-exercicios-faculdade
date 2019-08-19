/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poo.exercicios.faculdade.lista01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pc Dell
 */
public class Q08 {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor:");
        int primo = sc.nextInt();
        boolean isPrimo = true;
        ArrayList<Integer> divisor = new ArrayList<Integer>();
        for (int i = 2; i <= primo; i++) {
            if (((primo % i) == 0) && (i != primo)) {
                isPrimo = false;
                divisor.add(i);
            }
        }
        if (isPrimo) {
            System.out.println("é Primo");
        } else {
            System.out.print("Não é Primo e seus divisores são --> ");
            for (Integer i : divisor) {
                System.out.print(i + ", ");
            }
        }

    }
}
