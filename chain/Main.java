package chain;

// Classe de teste: monta a cadeia de aprovadores e envia pedidos para aprovação.
public class Main {
    public static void main(String[] args) {
        Aprovador supervisor = new Supervisor();
        Aprovador gerente = new Gerente();
        Aprovador diretor = new Diretor();
        Aprovador ceo = new CEO();

        supervisor.setProximo(gerente);
        gerente.setProximo(diretor);
        diretor.setProximo(ceo);

        Pedido p1 = new Pedido(300, "teclado");
        Pedido p2 = new Pedido(500, "monitor");
        Pedido p3 = new Pedido(10000, "PC");
        Pedido p4 = new Pedido(50000, "prédio");

        supervisor.aprovar(p1);
        supervisor.aprovar(p2);
        supervisor.aprovar(p3);
        supervisor.aprovar(p4);
    }
}