package br.com.villaca.interface6;

/**
 *
 * @author 10380
 */
public class ArquivoAudio implements Arquivo {

    @Override
    public void abrir() {
        System.out.println("Abrindo arquivo audio");
    }

    @Override
    public void fechar() {
        System.out.println("Fechando arquivo audio");
    }

    @Override
    public void ler() {
        System.out.println("Lendo arquivo audio");
    }

}
