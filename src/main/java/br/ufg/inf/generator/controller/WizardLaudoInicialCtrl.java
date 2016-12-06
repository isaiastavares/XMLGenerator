package br.ufg.inf.generator.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class WizardLaudoInicialCtrl extends AbstractWizardCtrl implements ControlledScreen {

    @FXML
    private TextField nomeLaudo;

    private ScreensController myController;

    @FXML
    public void initialize() {
        getNextButton().setOnAction(event -> next());
        getBackButton().setVisible(false);
        initializeFinishButton();
    }

    @Override
    public void setScreenParent(ScreensController screenPage) {
        myController = screenPage;
    }

    @Override
    void back() {
        // Do Nothing
    }

    @Override
    void next() {
        if ("".equals(nomeLaudo.getText())) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Erro encontrado");
            alert.setContentText("O nome do laudo nao pode ser nulo");
            alert.showAndWait();
        } else {
            myController.setScreen(IScreens.ID_EMPRESA_DESENVOLVEDORA);
        }
    }
}
