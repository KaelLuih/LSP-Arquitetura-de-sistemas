package CodigoCorreto.service;

import CodigoCorreto.model.Pedido;

public class FreteGratis implements EstrategiaDeFrete{

    @Override
    public double calcularValorFinal(Pedido pedido) {
        return pedido.getValorFinal();
    }
}
