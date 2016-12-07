package br.ufg.inf.generator.controller;

import org.apache.commons.lang3.StringUtils;

import br.ufg.inf.generator.alert.Dialogo;
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
		if (StringUtils.isBlank(nomeLaudo.getText())) {
			Dialogo.validacao("O nome do laudo não pode ser vazio");
			return false;
		}
		return true;
	}

	@Override
	protected void salvar() {
		setNomeLaudo(nomeLaudo.getText());
	}

}
