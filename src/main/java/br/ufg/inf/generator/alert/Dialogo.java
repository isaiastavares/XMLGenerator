package br.ufg.inf.generator.alert;

import javafx.scene.control.Alert;

public class Dialogo {

	private static final String TITULO_VALIDACAO_CAMPO_OBRIGATORIO = "Ops! Campo obrigat\u00f3rio n\u00e3o preenchido!";
	private static final String TITULO_VALIDACAO = "Validação";

	public static void validacao(String mensagem) {
		Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(TITULO_VALIDACAO);
        alert.setHeaderText(TITULO_VALIDACAO_CAMPO_OBRIGATORIO);
        alert.setContentText(mensagem);
        alert.showAndWait();
	}
}
