package br.ufg.inf.generator.telas.controladores;

import br.ufg.inf.generator.xml.estrutura.Mensagem;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public abstract class AbstractWizardCtrl {

    private static Mensagem mensagem;
    private static String nomeLaudo;

    @FXML
    private Button backButton;
    @FXML
    private Button nextButton;
    @FXML
    private Button finishButton;

    public synchronized Mensagem getMensagem() {
        if (mensagem == null) {
            mensagem = new Mensagem();
        }
        return mensagem;
    }

    public String getNomeLaudo() {
        return nomeLaudo;
    }

    public void setNomeLaudo(String nomeLaudo) {
        AbstractWizardCtrl.nomeLaudo = nomeLaudo;
    }

    protected Button getBackButton() {
        return backButton;
    }

    protected Button getNextButton() {
        return nextButton;
    }

    protected Button getFinishButton() {
        return finishButton;
    }

    protected abstract void back();

    protected void next() {
        if (isValido()) {
            salvar();
            nextScreen();
        }
    }

    protected abstract void nextScreen();

    protected abstract boolean isValido();

    protected abstract void salvar();

    protected void initializeFinishButton() {
        getFinishButton().setOnAction(event -> System.exit(0));
    }
}
