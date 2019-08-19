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
public class Q06 {

    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.print("Digite a palavra:");
        String normal = scanner.next();
        String invertida = new StringBuffer(normal).reverse().toString();

        if (normal.equals(invertida)) {
            System.out.println("É palíndrome");
        } else {
            System.out.println("Não é palíndrome");
        }
        scanner.close();
    }
}
