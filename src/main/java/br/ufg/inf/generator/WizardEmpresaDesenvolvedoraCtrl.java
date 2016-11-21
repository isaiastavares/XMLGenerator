package br.ufg.inf.generator;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class WizardEmpresaDesenvolvedoraCtrl extends AbstractWizardCtrl implements ControlledScreen {

	@FXML
	private TextField tfRazaoSocial;

	ScreensController myController;

	@FXML
	public void initialize() {
		getNextButton().setOnAction(event -> next());

		getBackButton().setDisable(true);
		getFinishButton().setDisable(true);
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
		myController.setScreen(XMLGeneratorMain.idOtc);
	}

	@Override
	void finish() {
		// Do Nothing
	}

}
