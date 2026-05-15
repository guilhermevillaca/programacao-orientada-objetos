
package br.com.villaca.interface3;

/**
 *
 * @author 10380
 */
public class Bicicleta implements Veiculo{

    @Override
    public void acelerar() {
        System.out.println("Acelerando bicicleta");
    }

    @Override
    public void frear() {
        System.out.println("Freiando bicicleta");
    }

    @Override
    public void virar(String direcao) {
        System.out.println("Virando bicicleta para " + direcao);
    }
    
}
