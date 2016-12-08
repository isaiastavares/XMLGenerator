package br.ufg.inf.generator.controller;

import javafx.fxml.FXML;

public class WizardHomologacaoEcfCtrl extends AbstractWizardCtrl implements ControlledScreen {

    private ScreensController myController;

    @FXML
    public void initialize() {
        getNextButton().setOnAction(event -> next());
        getBackButton().setOnAction(event -> back());
        initializeFinishButton();
    }

    @Override
    public void setScreenParent(ScreensController screenPage) {
        myController = screenPage;
    }

    @Override
    protected void back() {
        myController.setScreen(IScreens.ID_APLICACOES_ESPECIAIS);
    }

    @Override
    protected void nextScreen() {
//        myController.setScreen(IScreens.ID_OTC);
    }

    @Override
    protected boolean isValido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void salvar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
