
package br.com.villaca.interface3;

/**
 *
 * @author 10380
 */
public class Carro implements Veiculo{

    @Override
    public void acelerar() {
        System.out.println("Acelerando carro");
    }

    @Override
    public void frear() {
        System.out.println("Freiando carro");
    }

    @Override
    public void virar(String direcao) {
        System.out.println("Virando carro para " + direcao);
    }
    
}
