package br.ufg.inf.generator;

import javafx.fxml.FXML;

public class WizardOtcCtrl  extends AbstractWizardCtrl implements ControlledScreen {

	ScreensController myController;

	@FXML
	public void initialize() {
		getBackButton().setOnAction(event -> back());
		getNextButton().setOnAction(event -> next());

		getFinishButton().setDisable(true);
    }

	@Override
	public void setScreenParent(ScreensController screenPage) {
		myController = screenPage;
	}

	@Override
	void back() {
		myController.setScreen(XMLGeneratorMain.ID_EMPRESA_DESENVOLVEDORA);
	}

	@Override
	void next() {
		myController.setScreen(XMLGeneratorMain.ID_LAUDO_FINAL);
	}

	@Override
	void finish() {
		// Do Nothing
	}

}
