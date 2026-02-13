package com.controler.classes;

import com.controler.Application;
import com.controler.classes.commands.AbrirPortaoCommand;
import com.controler.classes.commands.LigarLuzCommand;

// Classe Receiver do padrão Command.
// Possui o estado dos dispositivos (luz e portão) e métodos para alterá-los.
public class Controle {
    public boolean isLuzLigada = false;
    public boolean isPortaoAberto = false;
    private LigarLuzCommand controlarLuz;
    private AbrirPortaoCommand controlarPortao;

    public Controle(Application a) {
        controlarLuz = new LigarLuzCommand(this, a);
        controlarPortao = new AbrirPortaoCommand(this, a);
    }

    // Executa o comando para alternar a luz.
    public void alternarLuz(){
        controlarLuz.execute();
    }

    // Executa o comando para alternar o portão.
    public void alternarPortao(){
        controlarPortao.execute();
    }
}
