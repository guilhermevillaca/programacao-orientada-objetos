package br.com.villaca.interface7;

/**
 *
 * @author 10380
 */
public class Pix implements Pagamento {

    String chavePix;
    double saldo;

    public Pix(String chavePix, double saldo) {
        this.chavePix = chavePix;
        this.saldo = saldo;
    }

    @Override
    public void realizarPagamento(double valor) {
        if (valor > saldo) {
            System.out.println("Pagamento não autorizado");
        } else {
            System.out.println("Pagamento realizado com sucesso no valor de R$" + valor);
            saldo -= valor;
        }
    }

    @Override
    public void emitirComprovante() {
        System.out.println("Chave PIX: " + chavePix);
        System.out.println("Saldo: " + saldo);
    }

}
