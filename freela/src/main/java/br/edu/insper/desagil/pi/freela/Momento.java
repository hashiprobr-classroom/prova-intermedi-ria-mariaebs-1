package br.edu.insper.desagil.pi.freela;

public abstract class Momento {
    public int ajusta(int valor, int max, int min){
        int novo_valor=0;
        if(valor>min && valor<max){
            novo_valor= valor;
        }if(valor<min){
            novo_valor= min;
        }if(valor>max){
            novo_valor= max;
        }
        return novo_valor;
    }
    public abstract int minutos();
}
