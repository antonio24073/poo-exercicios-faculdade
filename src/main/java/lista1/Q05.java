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
public class Q05 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor emprestado:");
        Double valorEmprestado = sc.nextDouble();
        System.out.print("Digite o pagamento mensal:");
        Double pagamentoMensal = sc.nextDouble();
        System.out.print("Digite a taxa de juros (%):");
        Double taxaJuros = sc.nextDouble()/100;

        Double valorAPagar = valorEmprestado;
        Double jurosPagos = 0.0;
        Double valorAplicadoPagamento = 0.0;
        Double jurosPagosAcumulado = 0.0;
        int mes = 0;
        Double valorUltimaPrestacao = 0.0;
        Double sobraUltimoPagamentoMensal = 0.0;
        Double montante = getMontante(pagamentoMensal, valorAPagar, taxaJuros);
        
        while (valorAPagar > 0) {
            mes++;
            jurosPagos = valorAPagar * taxaJuros;
            valorAPagar = valorAPagar + jurosPagos;
            if(valorAPagar >= pagamentoMensal){
                valorAPagar -= pagamentoMensal;
            }else{
                valorAPagar = 0.0;
                sobraUltimoPagamentoMensal = pagamentoMensal - valorAPagar;
                pagamentoMensal -= sobraUltimoPagamentoMensal;
                valorUltimaPrestacao = pagamentoMensal;
            }
            valorAplicadoPagamento += pagamentoMensal;
            jurosPagosAcumulado += jurosPagos;
            System.out.println("Juros Pagos ao mês: "+jurosPagos);
            System.out.println("Valor aplicado ao pagamento da dívida: "+valorAplicadoPagamento);
            System.out.println("Valor de juros já pagos: "+ jurosPagos);
            System.out.println("Valor ainda por pagar do emprestimo ao fim de cada mes: "+(montante-valorAplicadoPagamento));
        }
        System.out.println("Número de meses necessário para pagar o empréstimo: "+mes);
        System.out.println("Quantidade da última prestação: "+valorUltimaPrestacao);
        
    }

    private static Double getMontante(Double pagamentoMensal, Double valorAPagar, Double taxaJuros) {
        Double jurosPagos = 0.0;
        Double sobraUltimoPagamentoMensal = 0.0;
        Double valorUltimaPrestacao = 0.0;
        Double montante = 0.0;
        while (valorAPagar > 0) {
            jurosPagos = valorAPagar * taxaJuros;
            valorAPagar = valorAPagar + jurosPagos;
            if(valorAPagar >= pagamentoMensal){
                valorAPagar -= pagamentoMensal;
            }else{
                valorAPagar = 0.0;
                sobraUltimoPagamentoMensal = pagamentoMensal - valorAPagar;
                pagamentoMensal -= sobraUltimoPagamentoMensal;
                valorUltimaPrestacao = pagamentoMensal;
            }
            montante += pagamentoMensal;
        }
        return montante;
    }
}
