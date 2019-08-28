/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Pc Dell
 */
public class Equipamento {
    Integer valor;
    List<Double> numeroEquipamentos;
    Integer numero;

    public Equipamento(Integer numeroEquipamentos) {
        this.numeroEquipamentos = gerarListaAleatoria(1000,9999, numeroEquipamentos);
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
    public Integer getNumeroEquipamentos() {
        return numeroEquipamentos;
    }
    
    public Integer getValor(Integer numero) {
        return valor;
    }

    public void setValor(Integer numero, Integer valor) {
        this.valor = valor;
    }



    
    
}
