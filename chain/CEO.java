package chain;

// Concrete Handler: Último da cadeia, aprova qualquer pedido que chegar até ele.
public class CEO extends Aprovador {
    @Override
    public void aprovar(Pedido pedido) {
        System.out.println("Compra de" + pedido.getItem() +
                           " por " + pedido.getValor() + "$ aprovada por CEO.");
    }
}
