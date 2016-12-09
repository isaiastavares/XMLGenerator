package br.ufg.inf.generator.controller;

import javafx.fxml.FXML;

public class WizardQuantidadeRetaguardaCtrl extends AbstractWizardCtrl implements ControlledScreen {

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
        myController.setScreen(IScreens.ID_INFORMACOES_RETAGUARDA);
    }

    @Override
    protected boolean isValido() {
        // TODO falta implementar validacao
        return true;
    }

    @Override
    protected void salvar() {
        // TODO falta implementar a parte de salvar
    }
}
