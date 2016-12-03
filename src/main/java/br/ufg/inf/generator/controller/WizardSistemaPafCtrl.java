package br.ufg.inf.generator.controller;

import javafx.fxml.FXML;

public class WizardSistemaPafCtrl extends AbstractWizardCtrl implements ControlledScreen {

    ScreensController myController;

    @FXML
    public void initialize() {
        getBackButton().setOnAction(event -> back());
        getNextButton().setOnAction(event -> next());
        initializeFinishButton();
        initializeFinishButton();
    }

    @Override
    public void setScreenParent(ScreensController screenPage) {
        myController = screenPage;
    }

    @Override
    void back() {
        myController.setScreen(IScreens.ID_OTC);
    }

    @Override
    void next() {

    }
}
