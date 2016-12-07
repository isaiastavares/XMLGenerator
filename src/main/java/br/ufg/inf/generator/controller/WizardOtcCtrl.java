package br.ufg.inf.generator.controller;

import javafx.fxml.FXML;

public class WizardOtcCtrl extends AbstractWizardCtrl implements ControlledScreen {

	private ScreensController myController;

    @FXML
    public void initialize() {
        getBackButton().setOnAction(event -> back());
        getNextButton().setOnAction(event -> next());
        initializeFinishButton();
    }

    @Override
    public void setScreenParent(ScreensController screenPage) {
        myController = screenPage;
    }

    @Override
    protected void back() {
        myController.setScreen(IScreens.ID_EMPRESA_DESENVOLVEDORA);
    }

    @Override
	protected void nextScreen() {
    	myController.setScreen(IScreens.ID_SISTEMA_PAF);
	}

	@Override
	protected boolean isValido() {
		// TODO falta implementar validacao
		return true;
	}

	@Override
	protected void salvar() {
		System.out.println(getMensagem().toString());
		// TODO falta implementar a parte de salvar
	}
}
