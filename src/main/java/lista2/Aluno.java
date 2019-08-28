/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2;

/**
 *
 * @author Pc Dell
 */
public class Aluno {
    String matricula;
    String nome;
    Double notaProva1;
    Double notaProva2;
    Double notaTrabalho;
    
    public Double calculaMedia(){
        return (this.notaProva1*2.5+this.notaProva2*2.5+this.notaTrabalho*2)/7;
    }
    public Double calculaOQueFaltaFinal(){
        return (6*7 - (this.notaProva1*2.5 + this.notaTrabalho*2))/2.5;
    }
}
