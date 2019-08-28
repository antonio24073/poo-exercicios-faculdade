/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Pc Dell
 */
public class Q11 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        System.out.print("Digite o minimo valor de salário:");
        Double minSalario = sc.nextDouble();
        System.out.print("Digite o maximo valor de salário:");
        Double maxSalario = sc.nextDouble();
        System.out.print("Digite o numero de funcionarios da empresa:");
        Integer qtdFuncionarios = sc.nextInt();
        
        List<Double> listSalariosFuncionarios = gerarListaAleatoria(minSalario, maxSalario, qtdFuncionarios);
        Double mediaSalario = getMediaSalario(listSalariosFuncionarios);
        
        System.out.println(listSalariosFuncionarios);
        System.out.println("Acima da média:");
        for(Double salario : listSalariosFuncionarios){
            if(salario > mediaSalario){
                System.out.println(""+salario);
            }
        }
        
    }

    private static Double getMediaSalario(List<Double> listSalariosFuncionarios) {
        Double somaSalario = 0.0;
        for(Double salario : listSalariosFuncionarios){
            somaSalario += salario;
        }
        return somaSalario/listSalariosFuncionarios.size();
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
