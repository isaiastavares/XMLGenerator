package br.ufg.inf.generator.controller;

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
    void back() {
        myController.setScreen(IScreens.ID_OTC);
    }

    @Override
    void next() {
        myController.setScreen(IScreens.ID_CARACTERISTICAS_PAF);
    }
}
