/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Pc Dell
 */
public class Voo {

    Data inicio;
    Integer numeroVoo;
    private final Map<Integer, Boolean> poltronas; // n poltrona, ocupado ou não

    public Voo(Integer numeroVoo, Data data) {
        this.inicio = data;
        this.numeroVoo = numeroVoo;
        this.poltronas = new HashMap<>();
        for (int i = 1; i <= 100; i++) {
            this.poltronas.put(i, false);
        }
    }

    public int proximoLivre() {
        for (int i = 1; i <= 100; i++) {
            if(this.poltronas.get(i)){
                return i;
            }
        }
        return 0;
    }
    public void verifica(int numeroPoltrona) {
        this.poltronas.get(numeroPoltrona);
    }
    public void ocupa(int numeroPoltrona){
        this.poltronas.put(numeroPoltrona, Boolean.TRUE);
    }
    public int vagas(){
        int soma = 0;
        for (int i = 1; i <= 100; i++) {
            if(this.poltronas.get(i)){
                soma++;
            }
        }
        return soma;
    }
    public Integer getNumeroVoo() {
        return numeroVoo;
    }
    
}
