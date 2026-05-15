package br.com.villaca.interface6;

/**
 *
 * @author 10380
 */
public class ArquivoImagem implements Arquivo {

    @Override
    public void abrir() {
        System.out.println("Abrindo arquivo imagem");
    }

    @Override
    public void fechar() {
        System.out.println("Fechando arquivo imagem");
    }

    @Override
    public void ler() {
        System.out.println("Lendo arquivo imagem");
    }
}
