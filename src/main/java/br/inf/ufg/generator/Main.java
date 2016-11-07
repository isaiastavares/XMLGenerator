package br.inf.ufg.generator;

import br.inf.ufg.generator.xml.Laudo;
import br.inf.ufg.generator.xml.Mensagem;

public class Main {

	public static void main(String[] args) {
		Laudo laudo = new Laudo();
		laudo.setVersao("1.00");
		Mensagem mensagem = new Mensagem();
		mensagem.setNumero("R2UFG0032015");
		mensagem.setEmiteNFe("true");
		laudo.setMensagem(mensagem);

		//printar o XML gerado
		System.out.println(laudo.toString());
	}

}
