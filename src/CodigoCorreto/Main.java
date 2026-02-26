package CodigoCorreto;

import CodigoCorreto.model.Pedido;
import CodigoCorreto.service.FreteGratis;
import CodigoCorreto.service.FretePadrao;
import CodigoCorreto.service.ProcessadorDePagamento;

public class Main {
    public static void main(String[] args) {
        Pedido meuPedido = new Pedido(150.0);
        ProcessadorDePagamento processador = new ProcessadorDePagamento();

        processador.processar(meuPedido,  new FretePadrao());
        processador.processar(meuPedido, new FreteGratis());
    }
}