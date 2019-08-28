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
public class Q03 {
    
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor:");
        int a = sc.nextInt();
        System.out.print("O valor em binário é: "+Integer.toBinaryString(a));
    }
}
