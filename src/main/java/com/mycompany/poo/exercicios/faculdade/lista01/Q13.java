/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poo.exercicios.faculdade.lista01;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/**
 *
 * @author Pc Dell
 */
public class Q13 {

    public static void main(String[] args) {
        List<String> nomes1 = Arrays.asList("Antonio", "Manuel", "Tadeu");
        List<String> nomes2 = Arrays.asList("Bruno", "Rodolfo", "Silvio");
        List<String> uniao = new ArrayList<>();

        for (int i = 0; i < nomes1.size(); i++) {
            if (nomes1.get(i).compareTo(nomes2.get(i)) < 0) {
                uniao.add(nomes1.get(i));
                uniao.add(nomes2.get(i));
            } else {
                uniao.add(nomes2.get(i));
                uniao.add(nomes1.get(i));
            }
        }
        System.out.println(uniao);
    }

}
