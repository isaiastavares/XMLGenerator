package br.ufg.inf.generator.controller;

import javafx.fxml.FXML;

public class WizardEmpresaDesenvolvedoraCtrl extends AbstractWizardCtrl implements ControlledScreen {

    ScreensController myController;

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
    void back() {
        myController.setScreen(IScreens.ID_LAUDO_INICIAL);
    }

    @Override
    void next() {
        myController.setScreen(IScreens.ID_OTC);
    }
}
