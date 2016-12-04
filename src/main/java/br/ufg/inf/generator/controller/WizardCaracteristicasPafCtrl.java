/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.generator.controller;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class WizardCaracteristicasPafCtrl extends AbstractWizardCtrl implements ControlledScreen {

    ScreensController myController;

    @FXML
    private final ChoiceBox choiceMeioGeracao;

    public WizardCaracteristicasPafCtrl() {
        this.choiceMeioGeracao = new ChoiceBox(FXCollections.observableArrayList("Pelo PAF-ECF", "Pelo sistema de Retaguarda", "Pelo sistema PED ou EFD"));
    }

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
        myController.setScreen(IScreens.ID_SISTEMA_PAF);
    }

    @Override
    void next() {
        myController.setScreen(IScreens.ID_APLICACOES_ESPECIAIS);
    }
}
