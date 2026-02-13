package com.controler.classes;

import com.controler.Application;

// Classe abstrata Command do padrão Command.
// Define a interface para comandos concretos e implementa undo genérico.
public abstract class Command {
    protected Application app;
    protected Controle controle;

    public Command(Controle c, Application a) {
        this.controle = c;
        this.app = a;
    }

    // Por padrão, desfazer repete a execução (pode ser sobrescrito).
    public void undo(){
        this.execute();
    }

    // Método a ser implementado pelos comandos concretos.
    public void execute(){
        // implements
    }
}
