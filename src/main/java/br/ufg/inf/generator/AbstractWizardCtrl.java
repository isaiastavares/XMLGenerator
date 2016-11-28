package br.ufg.inf.generator;

import com.jfoenix.controls.JFXButton;

import javafx.fxml.FXML;

public abstract class AbstractWizardCtrl {

    @FXML
    private JFXButton backButton;

    @FXML
    private JFXButton nextButton;

    @FXML
    private JFXButton finishButton;

    public JFXButton getBackButton() {
        return backButton;
    }

    public JFXButton getNextButton() {
        return nextButton;
    }

    public JFXButton getFinishButton() {
        return finishButton;
    }

    abstract void back();

    abstract void next();

    abstract void finish();
}
