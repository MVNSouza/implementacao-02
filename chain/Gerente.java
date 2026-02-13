package chain;

// Concrete Handler: Aprova pedidos até um valor limite maior que o Supervisor.
// Encaminha para o próximo se não puder aprovar.
public class Gerente extends Aprovador {
    @Override
    public void aprovar(Pedido pedido) {
        if (pedido.getValor() <= 500) {
            System.out.println("Compra de " + pedido.getItem() +
                               " por " + pedido.getValor() +"$ aprovada por Gerente");
        } else if (proximo != null) {
            proximo.aprovar(pedido);
        }
    }
}
