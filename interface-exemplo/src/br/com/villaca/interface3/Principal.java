
package br.com.villaca.interface3;

/**
 *
 * @author 10380
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Veiculo veiculo = new Carro();
        veiculo.acelerar();
        veiculo.frear();
        veiculo.virar("direita");
        
        veiculo = new Bicicleta();
        veiculo.acelerar();
        veiculo.frear();
        veiculo.virar("esquerda");
        
    }
    
}
