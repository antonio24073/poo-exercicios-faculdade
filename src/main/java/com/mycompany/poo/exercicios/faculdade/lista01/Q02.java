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
public class Q02 {
    
    public static void main(String[] args) {
        Double somaSalarioAtual = 0.0;
        Double somaSalarioReajustado = 0.0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Digite o nome do funcionário:");
            String nome = sc.next();
            
            if (nome.equals("FIM") || nome.equals("fim")) {
                break;
            }
            
            System.out.print("Digite o salário atual do funcionário:");
            Double salarioAtual = sc.nextDouble();
            
            Double salarioReajustado = null;
            if(salarioAtual <= 150){
                salarioReajustado = salarioAtual + (salarioAtual * 0.25);
            }else if(salarioAtual > 150 && salarioAtual <=300){
                salarioReajustado = salarioAtual + (salarioAtual * 0.20);
            }else if(salarioAtual > 300 && salarioAtual <=600){
                salarioReajustado = salarioAtual + (salarioAtual * 0.15);
            }else if(salarioAtual > 600){
                salarioReajustado = salarioAtual + (salarioAtual * 0.10);
            }
            System.out.println("Nome: "+nome);
            System.out.println("Salário Atual: "+salarioAtual);
            System.out.println("Salário Reajustado: "+salarioReajustado);
            
            somaSalarioAtual += salarioAtual;
            somaSalarioReajustado += salarioReajustado;
            
        }
        sc.close();
        System.out.println("Soma dos slários atuais: "+somaSalarioAtual);
        System.out.println("Soma dos salários reajustados: "+somaSalarioReajustado);
        System.out.println("Diferença: "+ (somaSalarioAtual+somaSalarioReajustado));
    }
}
