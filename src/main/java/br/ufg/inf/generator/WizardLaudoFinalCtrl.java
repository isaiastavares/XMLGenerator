package br.ufg.inf.generator;

import javafx.fxml.FXML;

public class WizardLaudoFinalCtrl extends AbstractWizardCtrl implements ControlledScreen {

	ScreensController myController;

	@FXML
	public void initialize() {
		getFinishButton().setOnAction(event -> finish());

		getBackButton().setDisable(true);
		getNextButton().setDisable(true);
		getFinishButton().setDisable(false);
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
		// Do Nothing
	}

	@Override
	void finish() {
		System.exit(0);
	}
}
