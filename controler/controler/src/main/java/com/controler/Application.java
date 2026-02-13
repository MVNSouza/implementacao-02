package com.controler;

import java.util.Scanner;

import com.controler.classes.Command;
import com.controler.classes.CommandHistory;
import com.controler.classes.Controle;
import com.controler.classes.commands.AbrirPortaoCommand;
import com.controler.classes.commands.LigarLuzCommand;

// Classe principal (Client) do padrão Command.
// Responsável por interagir com o usuário, criar comandos e gerenciar o histórico de comandos.
public class Application {

    private CommandHistory history = new CommandHistory();
    private Controle controle;

    public Application() {
        this.controle = new Controle(this);
    }

    public static void main(String[] args) {
        Application app = new Application();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao Controle de Casa!");
        String menu = "\nComandos disponíveis:\n" +
                      "1 - Alternar Luz\n" +
                      "2 - Alternar Portão\n" +
                      "3 - Desfazer\n" +
                      "4 - Refazer\n" +
                      "0 - Sair\n" +
                      "Escolha: ";
        int opcao;
        do {
            System.out.print(menu);
            while (!scanner.hasNextInt()) {
                System.out.print("Digite um número válido: ");
                scanner.next();
            }
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    app.alternarLuz();
                    break;
                case 2:
                    app.alternarPortao();
                    break;
                case 3:
                    app.undo();
                    break;
                case 4:
                    app.redo();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
        scanner.close();
    }

    // Cria e executa o comando para alternar a luz, adicionando ao histórico.
    public void alternarLuz() {
        Command cmd = new LigarLuzCommand(controle, this);
        cmd.execute();
        history.push(cmd);
    }

    // Cria e executa o comando para alternar o portão, adicionando ao histórico.
    public void alternarPortao() {
        Command cmd = new AbrirPortaoCommand(controle, this);
        cmd.execute();
        history.push(cmd);
    }

    // Desfaz o último comando executado.
    public void undo(){
        Command c = history.pop();
        if (c == null) {
            System.out.println("Nenhuma ação para ser desfeita");
        } else {
            c.undo();
        }
    }

    // Refaz o último comando desfeito.
    public void redo(){
        Command c = history.redoPop();
        if (c == null) {
            System.out.println("Nenhuma ação para ser refeita");
        } else {
            c.undo();
        }
    }
}