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
public class Q04 {

    static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor:");
        int a = sc.nextInt();

        // teste do programa. Imprime os 30 primeiros termos       
        for (int i = 0; ; i++) {
            if(fibo(i)==a){
                System.out.println("Pertence a sequencia de fibonacci.");
                break;
            }
            if(fibo(i) > a){
                System.out.println("Não pertence a sequencia de fibonacci");
                break;
            }
        }

    }
}
