package br.ufg.inf.generator.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public abstract class AbstractWizardCtrl {

    @FXML
    private Button backButton;

    @FXML
    private Button nextButton;

    @FXML
    private Button finishButton;

    public Button getBackButton() {
        return backButton;
    }

    public Button getNextButton() {
        return nextButton;
    }

    public Button getFinishButton() {
        return finishButton;
    }

    abstract void back();

    abstract void next();

    public void initializeFinishButton() {
        getFinishButton().setOnAction(event -> System.exit(0));
    }
}
