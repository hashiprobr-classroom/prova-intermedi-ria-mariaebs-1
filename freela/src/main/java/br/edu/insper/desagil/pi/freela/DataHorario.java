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
    public void atualiza(int novaHora, int novoMinuto){

        if(novoMinuto<60 && novoMinuto>=0){
            minuto=novoMinuto;
        }else{
            minuto=ajusta(novoMinuto,59,0);
        }
        if(novaHora>=0 && novaHora<24){
            hora=novaHora;
        }else{
            hora=ajusta(novaHora,23,0);
        }
    }
    @Override
    public int minutos() {
        int total=hora*60+minuto;
        return data.minutos()+total;
    }
}
