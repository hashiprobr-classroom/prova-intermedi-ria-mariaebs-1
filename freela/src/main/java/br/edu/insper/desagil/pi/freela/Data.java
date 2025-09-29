package br.edu.insper.desagil.pi.freela;

import java.util.HashMap;

public class Data extends Momento{
    private int ano;
    private int mes;
    private int dia;
    private HashMap<Integer,Integer>limite;

    public Data(){
        this.ano=1970;
        this.mes=1;
        this.dia=1;
        this.limite = new HashMap<>();
        limite.put(1, 31);
        limite.put(2, 28);
        limite.put(3, 31);
        limite.put(4, 30);
        limite.put(5, 31);
        limite.put(6, 30);
        limite.put(7, 31);
        limite.put(8, 31);
        limite.put(9, 30);
        limite.put(10, 31);
        limite.put(11, 30);
        limite.put(12, 31);
    }

    public int getAno() {
        return ano;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public void atualiza(int ano, int mes, int dia){
        int novoAno=0;
        int novoMes=0;
        int novoDia=0;
        if(ano>1969 && ano<2071){
            novoAno=ano;
        }else{
            novoAno=ajusta(ano,2070,1970);
        }
        if(mes>0 && mes<13){
            novoMes=mes;
        }else{
            novoMes=ajusta(mes,12,1);
        }
        if(dia>0 && dia<limite.get(mes)){
            novoDia=dia;
        }else{
            novoDia=ajusta(dia,limite.get(mes),1);
        }
    }

    @Override
    public int minutos() {
        int total_dias=0;
        for(int i=1;i<mes;i++){
            total_dias+=limite.get(i);
        }
        return 24*60*365*ano+60*24*dia+total_dias*24*60;
    }
}
