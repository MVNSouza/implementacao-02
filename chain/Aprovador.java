package chain;

// Classe base abstrata do padrão Chain of Responsibility.
// Define a interface para manipulação dos pedidos e mantém referência ao próximo aprovador na cadeia.
public abstract class Aprovador {
    public Aprovador proximo;

    // Define o próximo aprovador na cadeia.
    public void setProximo(Aprovador proximo) {
        this.proximo = proximo;
    }

    // Método abstrato que será implementado por cada aprovador concreto.
    public abstract void aprovar(Pedido pedido);
}