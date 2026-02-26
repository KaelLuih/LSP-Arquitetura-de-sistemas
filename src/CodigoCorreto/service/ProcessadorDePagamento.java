package CodigoCorreto.service;

// 1. Importar o pedido do lugar certo
import CodigoCorreto.model.Pedido;

public class ProcessadorDePagamento {
    public void processar(Pedido pedido, EstrategiaDeFrete estrategia) {

        double valorFinal = estrategia.calcularValorFinal(pedido);

        if (valorFinal < pedido.getValorBruto()) {
            throw new IllegalStateException("Erro de contrato: O frete não pode reduzir o valor do produto.");
        }

        System.out.println("Pagamento processado com sucesso! Valor: " + valorFinal);
    }
}