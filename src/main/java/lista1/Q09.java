/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1;

import java.util.Scanner;

/**
 *
 * @author Pc Dell
 */
public class Q09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de d (distancia):");
        Double d = sc.nextDouble();
        System.out.print("Digite o valor de a (angulo):");
        Double a = sc.nextDouble();

        Double dhor = d * Math.cos(a);
        Double altura = Math.sqrt(d * d - dhor * dhor);

        System.out.println("altura: " + altura);
        System.out.println("distancia: " + dhor);

    }
}
