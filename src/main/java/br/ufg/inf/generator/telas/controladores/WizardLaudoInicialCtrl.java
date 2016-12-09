package br.ufg.inf.generator.telas.controladores;

import br.ufg.inf.generator.validadores.valores.ValidationFields;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class WizardLaudoInicialCtrl extends AbstractWizardCtrl implements ControlledScreen {

    @FXML
    private TextField nomeLaudo;

    private ScreensController myController;

    @FXML
    public void initialize() {
        getNextButton().setOnAction(event -> next());
        getBackButton().setVisible(false);
        initializeFinishButton();
    }

    @Override
    public void setScreenParent(ScreensController screenPage) {
        myController = screenPage;
    }

    @Override
    protected void back() {
        // Do Nothing
    }

    @Override
    protected void nextScreen() {
        myController.setScreen(IScreens.ID_EMPRESA_DESENVOLVEDORA);
    }

    @Override
    protected boolean isValido() {
        return ValidationFields.checkEmptyFields(nomeLaudo);
    }

    @Override
    protected void salvar() {
        setNomeLaudo(nomeLaudo.getText());
        getMensagem().setNumero(nomeLaudo.getText());
    }
}
