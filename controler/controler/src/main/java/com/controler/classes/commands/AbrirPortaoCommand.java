package com.controler.classes.commands;

import com.controler.Application;
import com.controler.classes.Command;
import com.controler.classes.Controle;

// Comando concreto do padrão Command.
// Responsável por alternar o estado do portão.
public class AbrirPortaoCommand extends Command{

    public AbrirPortaoCommand(Controle c, Application a) {
        super(c, a);
    }

    @Override
    public void execute() {
        controle.isPortaoAberto = !controle.isPortaoAberto;
        if (controle.isPortaoAberto) {
            System.out.println("Portão aberto!");
        } else {
            System.out.println("Portão fechado!");
        }
    }
    
}
