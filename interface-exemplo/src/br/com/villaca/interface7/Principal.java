package br.com.villaca.interface7;

/**
 *
 * @author 10380
 */
public class Principal {

    public static void main(String[] args) {
        
        Pagamento cartaoCredito = new CartaoCredito("Guilherme Villaca", 5000);
        cartaoCredito.realizarPagamento(2000);
        cartaoCredito.emitirComprovante();
        
        System.out.println("-----------------------------");
        
        Pagamento pix = new Pix("4598989839", 3500);
        pix.realizarPagamento(1200);
        pix.emitirComprovante();
        
        System.out.println("-----------------------------");
        
        Pagamento boleto = new Boleto("32492394827304823049823049 230498230498 230498203948 203948", 1500, "Aguardando Pagamento");
        boleto.emitirComprovante();
        boleto.realizarPagamento(1500);
        
        boleto.emitirComprovante();
        
    }
}
