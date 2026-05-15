package br.com.villaca.interface6;

/**
 *
 * @author 10380
 */
public class ArquivoTexto implements Arquivo {

    @Override
    public void abrir() {
        System.out.println("Abrindo arquivo texto");
    }

    @Override
    public void fechar() {
        System.out.println("Fechando arquivo texto");
    }

    @Override
    public void ler() {
        System.out.println("Lendo arquivo texto");
    }

}
