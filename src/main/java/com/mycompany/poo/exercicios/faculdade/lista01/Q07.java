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
public class Q07 {

    public static void main(String[] args) {
        // ax²+bx+c=0
        double a;
        double b;
        double c;
        double delta;
        double x1;
        double x2;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor A:");
        a = sc.nextInt();
        while (a == 0) {
            System.out.print("Digite o valor A:");
            a = sc.nextInt();
        }
        System.out.print("Digite o valor b:");
        b = sc.nextInt();
        System.out.print("Digite o valor c:");
        c = sc.nextInt();
        sc.close();

        delta = (b * b) - (4 * a * c);

        x1 = 0;
        x2 = 0;

        if (delta >= 0) {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);

            if (x1 == x2) {
                System.out.println("x1="+x1+", x2="+x2+", duas raízes retorna status 2");
            } else {
                System.out.println("x1="+x1+", x2="+x2+", uma raiz apenas retorna status 1");
            }
        } else {
            System.out.println("x1="+x1+", x2="+x2+", se não houverem raízes retorna status 0.");
        }

    }
}
