package br.edu.insper.desagil.pi.freela;

public class DataHorario extends Momento {
    private int hora;
    private int minuto;
    private Data data;

    public DataHorario(Data data){
        this.data=data;
        this.hora=0;
        this.minuto=0;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
    public void atualiza(int hora, int minuto){
        int novoMinuto=0;
        int novaHora=0;
        if(minuto<60 && minuto>=0){
            novoMinuto=minuto;
        }else{
            novoMinuto=ajusta(minuto,59,0);
        }
        if(hora>=0 && hora<24){
            novaHora=hora;
        }else{
            novaHora=ajusta(hora,23,0);
        }
    }
    @Override
    public int minutos() {
        int total=0;
        total=hora*60+minuto;
        return data.minutos()+total;
    }
}
