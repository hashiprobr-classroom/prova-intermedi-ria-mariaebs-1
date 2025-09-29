package br.edu.insper.desagil.pi.freela;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    private List<Tarefa>tarefas;
    public Lista(){
        this.tarefas=new ArrayList<>();
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }
    public void adiciona(Tarefa tarefa){
        int i=0;
       for(Tarefa t: tarefas){
           if(tarefa.getId()==t.getId()){
               i+=1;
           }
       }
       if(i==0){
           tarefas.add(tarefa);
       }
    }
}
