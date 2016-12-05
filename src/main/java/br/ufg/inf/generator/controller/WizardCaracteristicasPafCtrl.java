/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.generator.controller;

import java.util.Arrays;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;

public class WizardCaracteristicasPafCtrl extends AbstractWizardCtrl implements ControlledScreen {

    private ScreensController myController;

    @FXML
    private ChoiceBox<String> choiceMeioGeracao;

    @FXML
    public void initialize() {
        getNextButton().setOnAction(event -> next());
        getBackButton().setOnAction(event -> back());
        initializeFinishButton();
        initializeChoiceBox();
    }

    private void initializeChoiceBox() {
    	choiceMeioGeracao.setItems(FXCollections.observableArrayList(getListMeioGeracao()));
    }

    private List<String> getListMeioGeracao() {
    	return Arrays.asList(
    			"Pelo PAF-ECF",
    			"Pelo sistema de Retaguarda",
    			"Pelo sistema PED ou EFD");
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
