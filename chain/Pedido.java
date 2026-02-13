package chain;

// Classe simples que representa o pedido a ser aprovado na cadeia.
public class Pedido{
    private double valor;
    private String item;

    public Pedido(double valor, String item) {
        this.valor = valor;
        this.item = item;
    }

    public double getValor() {
        return valor;
    }

    public String getItem() {
        return item;
    }
}