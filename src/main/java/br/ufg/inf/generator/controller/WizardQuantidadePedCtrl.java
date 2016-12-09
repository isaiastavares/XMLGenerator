package br.ufg.inf.generator.controller;

import javafx.fxml.FXML;

public class WizardQuantidadePedCtrl extends AbstractWizardCtrl implements ControlledScreen {

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
        switch (WizardCaracteristicasPafCtrl.getIntegracaoPafValue()) {
            case "Pela Retaguarda e PED ou EFD":
                myController.setScreen(IScreens.ID_INFORMACOES_RETAGUARDA);
                break;
            default:
                myController.setScreen(IScreens.ID_APLICACOES_ESPECIAIS);
                break;
        }
    }

    @Override
    protected void nextScreen() {
        myController.setScreen(IScreens.ID_INFORMACOES_PED);
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
