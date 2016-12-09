package br.ufg.inf.generator.telas.controladores;

import javafx.fxml.FXML;

public class WizardSistemaPafCtrl extends AbstractWizardCtrl implements ControlledScreen {

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
        myController.setScreen(IScreens.ID_OTC);
    }

    @Override
    protected void nextScreen() {
        myController.setScreen(IScreens.ID_CARACTERISTICAS_PAF);
    }

    @Override
    protected boolean isValido() {
        return true;
    }

    @Override
    protected void salvar() {
    	//TODO falta implementar a parte de salvar
    }
}
