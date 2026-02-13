package chain;

// Concrete Handler: Responsável por aprovar pedidos até um certo valor.
// Se não puder aprovar, passa para o próximo da cadeia.
public class Supervisor extends Aprovador {
    @Override
    public void aprovar(Pedido pedido) {
        if (pedido.getValor() <= 500) {
            System.out.println("Compra de " + pedido.getItem() +
                               " por " + pedido.getValor() +"$ aprovada por Supervisor");
        } else if (proximo != null) {
            proximo.aprovar(pedido);
        }
    }
}