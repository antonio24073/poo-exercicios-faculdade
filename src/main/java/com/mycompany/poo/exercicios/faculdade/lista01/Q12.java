/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poo.exercicios.faculdade.lista01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Pc Dell
 */
public class Q12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o minimo valor de peso:");
        Double min = sc.nextDouble();
        System.out.print("Digite o maximo valor de peso:");
        Double max = sc.nextDouble();
        System.out.print("Digite o numero de elementos:");
        Integer qtd = sc.nextInt();

        List<Double> listPesos = gerarListaAleatoria(min, max, qtd);

        Double menorPeso = Double.MAX_VALUE;
        for (Double peso : listPesos) {
            if (peso < menorPeso) {
                menorPeso = peso;
            }
        }
        int posicao = listPesos.indexOf(menorPeso);
        System.out.println(""+listPesos);
        System.out.println("O menor peso é: "+menorPeso);
        System.out.println("A posição no array do menor é : " + posicao);
    }

    private static List<Double> gerarListaAleatoria(Double rangeMin, Double rangeMax, Integer qtdElementos) {
        List<Double> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < qtdElementos; i++) {
            Double randomValue = rangeMin + (rangeMax - rangeMin) * random.nextDouble();
            list.add(randomValue);
        }
        return list;
    }
}
