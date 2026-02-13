package chain;

// Concrete Handler: Aprova pedidos até um valor limite maior que o Gerente.
// Encaminha para o próximo se não puder aprovar.
public class Diretor extends Aprovador {
    @Override
    public void aprovar(Pedido pedido) {
        if (pedido.getValor() <= 10000) {
            System.out.println("Compra de " + pedido.getItem() +
                               " por " + pedido.getValor() + "$ aprovada por Diretor");
        } else if (proximo != null) {
            proximo.aprovar(pedido);
        }
    }
}
