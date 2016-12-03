package br.ufg.inf.generator.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class WizardLaudoInicialCtrl extends AbstractWizardCtrl implements ControlledScreen {

	@FXML
	private TextField nomeLaudo;

	ScreensController myController;

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
	void back() {
		// Do Nothing
	}

	@Override
	void next() {
		myController.setScreen(IScreens.ID_EMPRESA_DESENVOLVEDORA);
	}

}
