package br.com.villaca.interface7;

/**
 *
 * @author 10380
 */
public class CartaoCredito implements Pagamento{
    
    String nomeTitular;
    double limite;
    
    public CartaoCredito(String nomeTitular, double limite){
        this.nomeTitular = nomeTitular;
        this.limite = limite;        
    }

    @Override
    public void realizarPagamento(double valor) {        
        if(valor > limite){
            System.out.println("Pagamento não autorizado");
        }else {
            System.out.println("Pagamento realizado com sucesso no valor de R$" + valor);
            limite -= valor;
        }        
        
    }

    @Override
    public void emitirComprovante() {
        System.out.println("Titular: " + nomeTitular);
        System.out.println("Limite: " + limite);
    }
    
    

}
