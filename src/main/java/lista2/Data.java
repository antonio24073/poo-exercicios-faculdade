/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Pc Dell
 */
public class Data {

    Calendar data;

    public Data(int ano, int mes, int dia) {
        this.data = Calendar.getInstance();
        if (ano > 2100 || ano < 1900 || mes < 0 || mes > 11 || dia > 31 || dia < 0) {
            this.data.set(Calendar.YEAR, 1);
            this.data.set(Calendar.MONTH, 0);
            this.data.set(Calendar.DAY_OF_MONTH, 1);
        } else {
            this.data.set(Calendar.YEAR, ano);
            this.data.set(Calendar.MONTH, mes);
            this.data.set(Calendar.DAY_OF_MONTH, dia);
        }
        
    }
    public int compara(Calendar data){
        return this.data.compareTo(data);
    }
    public int getDia(){
        return this.data.get(Calendar.DAY_OF_MONTH);
    }
    public int getMes(){
        return this.data.get(Calendar.MONTH);
    }
    public String getMesExtenso(){
        int month = getMes();
        String mes;
        switch (month) {
            case 1:
                mes = "Janeiro";
                break;
            case 2:
                mes = "Fevereiro";
                break;
            case 3:
                mes = "Março";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Maio";
                break;
            case 6:
                mes = "Junho";
                break;
            case 7:
                mes = "Julho";
                break;
            case 8:
                mes = "Agosto";
                break;
            case 9:
                mes = "Setembro";
                break;
            case 10:
                mes = "Outubro";
                break;
            case 11:
                mes = "Novembro";
                break;
            case 12:
                mes = "Dezembro";
                break;
            default:
                mes = "inválido";
                break;
        }
        return mes;
    }
    public int getAno(){
        return this.data.get(Calendar.YEAR);
    }
    public boolean isBissexto(){
        return new GregorianCalendar().isLeapYear(getAno());
    }
    

    public Data(Data data){
        this.setData(data.getData());
    }
    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }
    public Data clone(){
        return new Data(this);
    }
}
