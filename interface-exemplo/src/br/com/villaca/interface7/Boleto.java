package br.com.villaca.interface7;

/**
 *
 * @author 10380
 */
public class Boleto implements Pagamento {

    String codigoBarras;
    double valorBoleto;
    String status;

    public Boleto(String codigoBarras, double valorBoleto, String status) {
        this.codigoBarras = codigoBarras;
        this.valorBoleto = valorBoleto;
        this.status = status;
    }

    @Override
    public void realizarPagamento(double valor) {
        if (valorBoleto == valor) {
            status = "Pago";
            System.out.println("Boleto pago com sucesso");
        } else {
            System.out.println("Valor do boleto é diferente, pagamento não realizado");
        }
    }

    @Override
    public void emitirComprovante() {
        System.out.println("Código de Barras: " + codigoBarras);
        System.out.println("Status Boleto: " + status);
    }

}
