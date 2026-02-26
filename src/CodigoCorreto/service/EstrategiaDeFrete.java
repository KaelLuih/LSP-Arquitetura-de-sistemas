package CodigoCorreto.service;

import CodigoCorreto.model.Pedido;

public interface EstrategiaDeFrete {

    double calcularValorFinal(Pedido pedido);

}
