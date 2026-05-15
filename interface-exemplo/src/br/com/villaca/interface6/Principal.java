package br.com.villaca.interface6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 10380
 */
public class Principal {
    
    public static void main(String[] args) {        
        
        List<Arquivo> arquivos = new ArrayList<>();
        arquivos.add(new ArquivoTexto());
        arquivos.add(new ArquivoAudio());
        arquivos.add(new ArquivoImagem());
        
        for(Arquivo arquivo: arquivos){
            arquivo.abrir();            
            arquivo.ler();
            arquivo.fechar();
            System.out.println("-----------------------");
        }
        
    }

}
