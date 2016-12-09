package br.ufg.inf.generator.telas.controladores;

import javafx.fxml.FXML;

public class WizardLaudoFinalEcfCtrl extends AbstractWizardCtrl implements ControlledScreen {

    private ScreensController myController;

    @FXML
    public void initialize() {
        getNextButton().setVisible(false);
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
        // Do Nothing
    }

    @Override
    protected boolean isValido() {
        return true;
    }

    @Override
    protected void salvar() {
        // TODO falta implementar a parte de salvar
    }
}
