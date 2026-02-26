package CodigoCorreto.service;

import CodigoCorreto.model.Pedido;

public class FretePadrao implements EstrategiaDeFrete {
    @Override
    public double calcularValorFinal(Pedido pedido) {
        return pedido.getValorFinal() + 10.0;
    }
}
