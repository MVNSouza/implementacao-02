package com.controler.classes;

import java.util.ArrayList;

public class CommandHistory {
    private ArrayList<Command> comandosList = new ArrayList<>();
    private ArrayList<Command> supportComandosList = new ArrayList<>();

    public void push(Command c){
        this.comandosList.add(c);
    }

    public Command pop(){
        if (!this.comandosList.isEmpty()){
            Command comando = this.comandosList.remove(comandosList.size() - 1);
            this.supportComandosList.add(comando);
            return comando;
        } else {
            return null;
        }
    }

    public Command redoPop(){
        if(!this.supportComandosList.isEmpty()){
            Command c = supportComandosList.remove(0);
            return c;
        } else {   
            return null;
        }
    }
}
