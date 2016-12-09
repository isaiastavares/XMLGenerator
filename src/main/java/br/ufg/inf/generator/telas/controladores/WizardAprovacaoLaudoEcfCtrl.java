package br.ufg.inf.generator.telas.controladores;

import javafx.fxml.FXML;

public class WizardAprovacaoLaudoEcfCtrl extends AbstractWizardCtrl implements ControlledScreen {

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
        myController.setScreen(IScreens.ID_ANALISE_FUNCIONAL);
    }

    @Override
    protected void nextScreen() {
//        myController.setScreen(IScreens.);
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
