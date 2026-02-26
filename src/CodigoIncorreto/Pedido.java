/* package CodigoIncorreto;

public class Pedido {
    public double valorBruto;
    protected double valorFinal;
    protected double valorFrete = 0.0;
    public Pedido(double valorBruto) {
        this.valorBruto = valorBruto;
        this.valorFinal = valorBruto;
    }

    public void aplicarFrete(double valorFrete) {
        if (valorFrete < 0) {
            throw new IllegalArgumentException("Frete não pode ser negativo.");
        }
        this.valorFrete = valorFrete;
        this.valorFinal = this.valorBruto + this.valorFrete;
    }
    public double getValorFinal() { return valorFinal; }
}
public class PedidoComFreteGratis extends Pedido {
    public PedidoComFreteGratis(double valorBruto) {
        super(valorBruto);
    }
    @Override
    public void aplicarFrete(double valorFrete) {
        this.valorFrete = 0.0;
        this.valorFinal = this.valorBruto;
        System.out.println("Frete grátis aplicado. Valor final mantido.");
    }
}

public class ProcessadorDePagamento {
    public void processar(Pedido pedido, double freteBase) {
        pedido.aplicarFrete(freteBase);


        if (pedido.getValorFinal() < pedido.valorBruto) {


            throw new IllegalStateException("Erro de contrato: O valor final não ");
        }
    }
}
 */