package com.controler.classes.commands;

import com.controler.Application;
import com.controler.classes.Command;
import com.controler.classes.Controle;

// Comando concreto do padrão Command.
// Responsável por alternar o estado da luz.
public class LigarLuzCommand extends Command {

    public LigarLuzCommand(Controle c, Application a) {
        super(c, a);
    }

    @Override
    public void execute(){
        controle.isLuzLigada = !controle.isLuzLigada;
        if (controle.isLuzLigada) {
            System.out.println("Luz ligada!");
        } else {
            System.out.println("Luz desligada!");
        }
    }
    
}
